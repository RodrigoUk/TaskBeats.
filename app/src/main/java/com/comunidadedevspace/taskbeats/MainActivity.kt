package com.comunidadedevspace.taskbeats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taskList: RecyclerView = findViewById(R.id.rv_task_list)

        val list = listOf<String>(
            "Title 1", "Title 2", "Title 3", "Title 4", "Title 5",
            "Title 6", "Title 7", "Title 8", "Title 9", "Title 10",
        )

        val adapter = TaskListAdapter(list)

        taskList.adapter = adapter

        

    }

    fun openTaskDetailView(task: Task) {


    }
}