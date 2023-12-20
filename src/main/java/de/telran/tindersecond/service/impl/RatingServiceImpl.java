package de.telran.tindersecond.service.impl;

import de.telran.tindersecond.entity.User;
import de.telran.tindersecond.repository.UserRepository;
import de.telran.tindersecond.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService {

    private final UserRepository userRepository;


    @Override
    @Transactional
    public void shareRating(Long fromId, Long toId, Integer countOfRating) {
        Optional<User> fromUserOptional = userRepository.findById(fromId);
        Optional<User> toUserOptional = userRepository.findById(toId);

        if (fromUserOptional.isPresent() && toUserOptional.isPresent()) {
            User fromUser = fromUserOptional.get();
            User toUser = toUserOptional.get();
            //подарить сколько-то рейтинга

            fromUser.setRating(fromUser.getRating() - countOfRating);
            toUser.setRating(toUser.getRating() + countOfRating);

            userRepository.save(fromUser);


            if (true) {
                throw new RuntimeException();
            }

            userRepository.save(toUser);
        }

    }


}
