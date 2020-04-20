package com.dm.demomongodb.repository;

import com.dm.demomongodb.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProjectRepository extends MongoRepository<Project,Integer> {
    public Optional<Project> findProjectById(int id);
    public Optional<Project> deleteProjectById(int id);

}
