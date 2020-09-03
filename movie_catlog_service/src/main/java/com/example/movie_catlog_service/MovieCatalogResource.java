package com.example.movie_catlog_service;

import Model.CatalogItem;
import Model.Movie;
import Model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Arrays.*;
import java.util.Collections;
import java.util.List;
//http://localhost:8080/catalog/abc
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){

        List<Rating> ratings;
        ratings =  Arrays.asList(new Rating("1234",4),new Rating("2345",3));
        RestTemplate restTemplate=new RestTemplate();
        Movie movie;
        for(int i=0;i<ratings.size();i++){
            String movieId=ratings.get(i).getMovieId();
            movie= restTemplate.getForObject("http://localhost:8081/movies/"+movieId, Movie.class);

        }

        return Collections.singletonList(new CatalogItem("Transformers","Sci-Fi",4));
    }
}
