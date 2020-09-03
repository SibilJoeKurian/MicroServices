package com.example.movie_catlog_service;

import Model.CatalogItem;
import Model.Movie;
import Model.Rating;
import Model.Movie;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//http://localhost:8080/catalog/abc
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    WebClient.Builder webClientBuilder;
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){

        List<Rating> ratings;
        ratings =  Arrays.asList(new Rating("1234",4),new Rating("2345",3));
        //Movie movie=new Movie();
        List<CatalogItem> catlogItem=new ArrayList<>() ;
        /*
        for(int i=0;i<ratings.size();i++){
            String movieId=ratings.get(i).getMovieId();
            movie= restTemplate.getForObject("http://localhost:8081/movies/"+movieId, Movie.class);
            catlogItem.add(new CatalogItem(movie.getName(),"description",ratings.get(i).getRating()));
        }
        */

     return ratings.stream().map(rating -> {
          //Movie movie=restTemplate.getForObject("http://localhost:8081/movies/"+rating.getMovieId(),Movie.class);
         Movie movie =webClientBuilder.build()
                 .get()
                 .uri("http://localhost:8081/movies/"+rating.getMovieId())
                 .retrieve()
                 .bodyToMono(Movie.class)
                 .block();
         
          return new CatalogItem(movie.getName(),"description",rating.getRating());
      }).collect(Collectors.toList());
//
//        catlogItem.forEach((catalog)->System.out.println(catalog.toString()));
//        return catlogItem;
    }
}
