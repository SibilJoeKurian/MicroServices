package com.example.movie_catlog_service;

import Model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
//http://localhost:8080/catalog/abc
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
        RestTemplate restTemplate=new RestTemplate();
        return Collections.singletonList(new CatalogItem("Transformers","Sci-Fi",4));
    }
}
