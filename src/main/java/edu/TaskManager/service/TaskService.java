package edu.TaskManager.service;

import edu.TaskManager.entity.Task;
import edu.TaskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public List<Task> getAllTasks() { return repo.findAll(); }
    public Task saveTask(Task task) { return repo.save(task); }
    public void deleteTask(Long id) { repo.deleteById(id); }
    public Task updateTask(Task task) { return repo.save(task); }
}