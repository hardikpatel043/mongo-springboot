package com.dm.demomongodb.controller;

import com.dm.demomongodb.model.Movies;
import com.dm.demomongodb.repository.MoviesRepository;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

@RestController
public class MoviesController {
    @Autowired
    private MoviesRepository moviesRepository;

//    public @Bean
//    MongoDbFactory getMongoDbFactory() throws UnknownHostException {
//        return new SimpleMongoDbFactory(new MongoClient("35.224.193.56",27017),"admin");
//    }
//    public @Bean(name = "mongoTemplate")
//    MongoTemplate getMongoTemplate() throws UnknownHostException {
//        MongoTemplate mongoTemplate = new MongoTemplate(getMongoDbFactory());
//        return mongoTemplate;
//    }
    @GetMapping("/getAllMovies")
    public List<Movies> getAll(){
        return moviesRepository.findAll();
    }


    @GetMapping("/getMovieByTitle/{name}")
    public Optional<Movies> getMovieByTitleAll(@PathVariable String name){
        return moviesRepository.findMoviesByTitle(name);
    }

    @GetMapping("/getMoviesByTitleMatching/{name}")
    public List<Movies> getMovieByTitleContains(@PathVariable String name){
        return moviesRepository.findMoviesByTitleContains(name);
    }
}
