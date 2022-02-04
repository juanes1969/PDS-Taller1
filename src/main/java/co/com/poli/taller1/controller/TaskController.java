package co.com.poli.taller1.controller;

import co.com.poli.taller1.entities.Task;
import co.com.poli.taller1.services.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskService;


    @PostMapping
    private Task create(@RequestBody Task task) {
        return taskService.create(task);
    }
}
