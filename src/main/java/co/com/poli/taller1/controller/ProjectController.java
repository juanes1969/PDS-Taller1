package co.com.poli.taller1.controller;

import co.com.poli.taller1.entities.Project;
import co.com.poli.taller1.services.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectServiceImpl projectService;

    @GetMapping
    private List<Project> findAll() {
        return projectService.findAll();
    }

    @PostMapping
    private Project create(@RequestBody Project project) {
        return projectService.create(project);
    }
}
