package com.dm.demomongodb.controller;

import com.dm.demomongodb.model.Project;
import com.dm.demomongodb.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

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
        //return projectRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProject(@PathVariable int id){
        projectRepository.deleteProjectById(id);
        return "Project Deleted with id "+ id;
    }



}
