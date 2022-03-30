package com.example.todoapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Repository {

    private List<Task> taskList;


    private static Repository sINSTANCE;

    private  Repository() {
        taskList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Task task = new Task();
            task.setTitle("Task"+ i);
            taskList.add(task);
        }
    }

    public static Repository getInstance(){
        if(sINSTANCE == null){
            sINSTANCE = new Repository();
       }
        return sINSTANCE;
    }


    public Task getTaskById(UUID id){
        for(Task item : taskList){
            if(item.getId() == id)
                return item;
        }
        return null;
    }


    public List<Task> getAllTask(){
        return taskList;
    }

    public void insert(Task task){
        taskList.add(task);
    }

    public void update(Task task){
        Task oldTask = getTaskById(task.getId());
        oldTask.setTitle(task.getTitle());
        oldTask.setDescription(task.getDescription());
        oldTask.setUpdatedDate(new Date());
    }

    public void delete(Task task){
        Task task1 = getTaskById(task.getId());
        taskList.remove(task);
    }
}
