package de.telran.tindersecond.controller;

import de.telran.tindersecond.ShareRatingDto;
import de.telran.tindersecond.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;

    @PostMapping(value = "/share")
    public void shareRating(@RequestBody ShareRatingDto shareRatingDto) {
        //валидацию добавить можно
        ratingService.shareRating(shareRatingDto.getFromId(), shareRatingDto.getToId(), shareRatingDto.getCountOfRating());
    }

    @PostMapping(value = "/share")
    public void shareRating(@RequestBody ShareRatingDto shareRatingDto) {
        //валидацию добавить можно
        ratingService.shareRating(shareRatingDto.getFromId(), shareRatingDto.getToId(), shareRatingDto.getCountOfRating());
    }

    @PostMapping(value = "/share")
    public void shareRating(@RequestBody ShareRatingDto shareRatingDto) {
        //валидацию добавить можно
        ratingService.shareRating(shareRatingDto.getFromId(), shareRatingDto.getToId(), shareRatingDto.getCountOfRating());
    }


}
