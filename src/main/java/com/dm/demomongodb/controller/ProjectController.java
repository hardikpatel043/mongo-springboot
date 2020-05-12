package com.dm.demomongodb.controller;

import com.dm.demomongodb.model.Project;
import com.dm.demomongodb.repository.ProjectRepository;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

//    public @Bean
//    MongoDbFactory getMongoDbFactory() throws UnknownHostException {
//        return new SimpleMongoDbFactory(new MongoClient("35.224.193.56",27017),"admin");
//    }
//    public @Bean(name = "mongoTemplate")
//    MongoTemplate getMongoTemplate() throws UnknownHostException {
//        MongoTemplate mongoTemplate = new MongoTemplate(getMongoDbFactory());
//        return mongoTemplate;
//    }

    @PostMapping("/addProject")
    public String saveProject(@RequestBody Project project){
         projectRepository.save(project);

        return "Added Project with Id " + project.getId();
    }

    @GetMapping("/findAllProjects")
    public List<Project> getProject(){
        return projectRepository.findAll();
    }

    @GetMapping("/findAllProjects/{id}")
    public Optional<Project> getProjectById(@PathVariable int id){
        return projectRepository.findProjectById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProject(@PathVariable int id){
        projectRepository.deleteProjectById(id);
        return "Project Deleted with id "+ id;
    }

    @GetMapping("/hellome")
    public String hellocall(){
        return "Hello Hardik";
    }

}
