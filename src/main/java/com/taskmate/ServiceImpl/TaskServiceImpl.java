package com.taskmate.ServiceImpl;

import java.util.List;

import com.taskmate.Entity.Task;

public interface TaskServiceImpl {
    
    public Task createTask(Task task);

    public Task updateTask(Task task);

    public void deleteTask(Long taskId);

    public Task getTask(Long taskId);

    public List<Task> getAllTask();

}
