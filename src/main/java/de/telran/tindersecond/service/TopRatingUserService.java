package de.telran.tindersecond.service;

import de.telran.tindersecond.User;
import de.telran.tindersecond.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class TopRatingUserService implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getNewUser() {
        List<User> users = userRepository.findAll();

        if (users == null || users.size() == 0) {
            throw new RuntimeException();
        }

        int maxRating = 0;
        User bestUser = null;

        for (User user : users) {
            if (user.getRating() > maxRating) {
                maxRating = user.getRating();
                bestUser = user;
            }
        }

        return bestUser;
    }
}
