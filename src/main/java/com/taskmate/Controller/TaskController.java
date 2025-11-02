package com.taskmate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.taskmate.Entity.Task;
import com.taskmate.Service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createTask(Task task){
        return taskService.create(task);
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable("id") Long id){
        return taskService.get(id);
    }

    @DeleteMapping
    public void delete(@PathVariable("id") Long id){
        taskService.delete(id);
    }

    @PutMapping("{id}")
    public Task updateTask(@PathVariable("id") Long id,Task task){
        return taskService.update(id, task);
    }

}
