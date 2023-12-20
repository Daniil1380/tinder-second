package de.telran.tindersecond.service;

import de.telran.tindersecond.ShareRatingDto;

public interface RatingService {

    void shareRating(Long fromId, Long toId, Integer countOfRating);

}
