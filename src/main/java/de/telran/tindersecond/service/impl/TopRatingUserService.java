package de.telran.tindersecond.service.impl;

import de.telran.tindersecond.entity.User;
import de.telran.tindersecond.repository.UserRepository;
import de.telran.tindersecond.service.UserService;
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

    @Override
    public List<User> getByName(String name) {
        List<User> users = userRepository.findAutocomplete2(name);
        return users;
    }
}
