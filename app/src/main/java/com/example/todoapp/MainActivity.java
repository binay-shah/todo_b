package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    public static  final String TAG = MainActivity.class.getSimpleName();
    private Repository repository;
    private List<Task> taskList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = Repository.getInstance();

        taskList = repository.getAllTask();

        Log.d(TAG, "taskList size"+taskList.size());


        for (Task task: taskList){
            Log.d(TAG, "task"+task);
        }
        
        repository.delete(taskList.get(0));
        Log.d(TAG, "taskList size"+taskList.size());

    }
}