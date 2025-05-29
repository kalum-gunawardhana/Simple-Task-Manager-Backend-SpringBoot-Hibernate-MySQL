package edu.TaskManager.controller;

import edu.TaskManager.entity.Task;
import edu.TaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> getAll() { return service.getAllTasks(); }

    @PostMapping
    public Task create(@RequestBody Task task) { return service.saveTask(task); }

    @PutMapping("/{id}") public Task update(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id); return service.updateTask(task);
    }

    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.deleteTask(id); }
}