package com.dm.demomongodb.repository;

import com.dm.demomongodb.model.Project;
import com.dm.demomongodb.multitenancy.UseDefaultMongoConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProjectRepository extends MongoRepository<Project,Integer> {
    @UseDefaultMongoConfig
    public Optional<Project> findProjectById(int id);
    public Optional<Project> deleteProjectById(int id);

}
