package com.taskmate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmate.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}