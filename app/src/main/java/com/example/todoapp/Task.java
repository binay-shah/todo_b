package com.example.todoapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.UUID;

@Entity(tableName = "tasks")
public class Task {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    @ColumnInfo(name = "Updated_date")
    private Date updatedDate;

    @Ignore
    public Task(int id, String title, String description, Date updatedDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.updatedDate = updatedDate;
    }

    public Task(String title, String description, Date updatedDate) {
        this.title = title;
        this.description = description;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
