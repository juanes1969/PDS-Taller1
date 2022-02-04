package co.com.poli.taller1.controller;

import co.com.poli.taller1.entities.Backlog;
import co.com.poli.taller1.entities.Project;
import co.com.poli.taller1.services.impl.BacklogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backlog")
public class BacklogController {

    @Autowired
    private BacklogServiceImpl backlogService;


    @GetMapping
    private List<Backlog> findAll() {
        return backlogService.findAll();
    }

    @PostMapping
    private Backlog create(@RequestBody Backlog backlog) {
        return backlogService.create(backlog);
    }

}
