package co.com.poli.taller1.services.impl;

import co.com.poli.taller1.entities.Backlog;
import co.com.poli.taller1.repository.BacklogRepository;
import co.com.poli.taller1.services.BacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BacklogServiceImpl implements BacklogService {

    @Autowired
    private BacklogRepository backlogRepository;


    @Override
    public List<Backlog> findAll() {
        return backlogRepository.findAll();
    }

    @Override
    public Backlog create(Backlog backlog) {
        return backlogRepository.save(backlog);
    }
}
