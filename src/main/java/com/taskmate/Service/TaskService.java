package com.taskmate.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmate.Entity.Task;
import com.taskmate.Repository.TaskRepository;
import com.taskmate.ServiceInterface.Services;

public class TaskService implements Services<Task>{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task create(Task data) {
        Task task = new Task(data.getCategoryId(),data.isCompleted(),data.getTitle(),data.getDescription());
        return taskRepository.save(task);
    }

    @Override
    public Task get(Long id) {
        if(id == null) return new Task();
        return taskRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        if(id == null) return;
        taskRepository.deleteById(id);
    }

    @Override
    public Task update(Long id, Task data) {
        if(id == null) return new Task();
        Task task = taskRepository.findById(id).orElseThrow();
        task.setCategoryId(data.getCategoryId());
        task.setCompleted(data.isCompleted());
        task.setDescription(data.getDescription());
        task.setTitle(data.getTitle());
        return taskRepository.save(task);
    }
    
}
