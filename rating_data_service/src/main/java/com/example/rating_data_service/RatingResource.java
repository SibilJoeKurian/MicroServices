package com.example.rating_data_service;

import Model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingData")
public class RatingResource {
@RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
    return new Rating(movieId,4);
}
}
