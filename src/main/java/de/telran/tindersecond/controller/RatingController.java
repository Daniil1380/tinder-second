package de.telran.tindersecond.controller;

import de.telran.tindersecond.ShareRatingDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {

    @PostMapping(value = "/share")
    public void shareRating(@RequestBody ShareRatingDto shareRatingDto) {
        System.out.println(shareRatingDto);
    }

}
