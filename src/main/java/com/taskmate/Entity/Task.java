package com.taskmate.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long categoryId;
    private boolean isCompleted;
    private String title;
    private String description;

    public Task(Long categoryId, boolean isCompleted, String title, String description) {
        this.categoryId = categoryId;
        this.isCompleted = isCompleted;
        this.title = title;
        this.description = description;
    }

    public Task() {
        //TODO Auto-generated constructor stub
    }

}

