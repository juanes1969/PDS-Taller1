package co.com.poli.taller1.services.impl;

import co.com.poli.taller1.entities.Task;
import co.com.poli.taller1.repository.TaskRepository;
import co.com.poli.taller1.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }
}
