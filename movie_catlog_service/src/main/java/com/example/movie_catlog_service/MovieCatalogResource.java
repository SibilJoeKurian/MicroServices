package com.example.movie_catlog_service;

import Model.CatalogItem;
import Model.Movie;
import Model.Rating;
import Model.Movie;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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
        Movie movie=new Movie();
        List<CatalogItem> catlogItem=new ArrayList<CatalogItem>() ;

        for(int i=0;i<ratings.size();i++){
            String movieId=ratings.get(i).getMovieId();
            movie= restTemplate.getForObject("http://localhost:8081/movies/"+movieId, Movie.class);
            catlogItem.add(new CatalogItem(movie.getName(),"description",ratings.get(i).getRating()));
        }
        catlogItem.forEach((catalog)->System.out.println(catalog.toString()));
        return catlogItem;
    }
}
