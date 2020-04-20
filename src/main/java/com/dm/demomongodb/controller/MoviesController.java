package com.dm.demomongodb.controller;

import com.dm.demomongodb.model.Movies;
import com.dm.demomongodb.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MoviesController {
    @Autowired
    private MoviesRepository moviesRepository;

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
