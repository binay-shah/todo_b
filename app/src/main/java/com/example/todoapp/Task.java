package com.example.todoapp;

import java.util.Date;
import java.util.UUID;

public class Task {

    private UUID id;
    private String title;
    private String description;
    private Date updatedDate;

    public Task(UUID id, String title, String description, Date updatedDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.updatedDate = updatedDate;
    }

    public Task() {
        id = UUID.randomUUID();
        updatedDate = new Date();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
