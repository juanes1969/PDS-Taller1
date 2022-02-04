package co.com.poli.taller1.services;

import co.com.poli.taller1.entities.Backlog;
import co.com.poli.taller1.entities.Project;

import java.util.List;

public interface BacklogService {

    List<Backlog> findAll();

    Backlog create(Backlog backlog);
}
