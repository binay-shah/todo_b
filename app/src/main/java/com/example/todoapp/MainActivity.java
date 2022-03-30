package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    public static  final String TAG = MainActivity.class.getSimpleName();
    private Repository repository;
    private List<Task> taskList;
    private RecyclerView recyclerView;
    private TodoAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.todo_list);


        repository = Repository.getInstance();

        taskList = repository.getAllTask();

        adapter = new TodoAdapter(taskList);

        recyclerView.setAdapter(adapter);





    }
}