package com.example.movie_info_service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8081/movies/123
@RestController
@RequestMapping("/movies")
public class MovieResource {
@RequestMapping("/{movieId}")
public Movie getMovieInfo(@PathVariable("movieId")String movieId){
    return new Movie(movieId,"Test Name");
}
}
