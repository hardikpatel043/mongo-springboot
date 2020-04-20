package com.dm.demomongodb.repository;

import com.dm.demomongodb.model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MoviesRepository extends MongoRepository<Movies,Integer> {
    public Optional<Movies> findMoviesByTitle(String name);

    @Query("{title : { $regex: ?0 } }")
    public List<Movies> findMoviesByTitleContains(String name);

}
