package de.telran.tindersecond.service;

import de.telran.tindersecond.User;
import de.telran.tindersecond.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service //то же, что и component, но более явно указывает, что это именно сервис
@RequiredArgsConstructor
public class RandomUserService implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getNewUser() {
        List<User> users = userRepository.findAll();

        if (users == null || users.size() == 0) {
            throw new RuntimeException();
        }

        Random random = new Random();

        int randomNumber = random.nextInt(users.size());

        return users.get(randomNumber);
    }

}
