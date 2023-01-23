package com.example.HelloWorld.Tasks;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//intermediate between service and main func...used for routing.

@RestController
public class TaskController {
    @Autowired
    private TaskService ts;
    public TaskController(){
        System.out.println("TaskController Created...");
    }
    @GetMapping("/")
    public List<Task> getAllTasks(){
        return ts.getAllTasks();
    }
    @PostMapping("/add")
    public String AddTask(@RequestBody Task add_task){
        return ts.AddTask(add_task);
    }

    @PutMapping("/update/{id}/{temp}")
    public String updateTask(@RequestBody Task update_Task, @PathVariable int id){
        return ts.updateTask(update_Task,id);
    }
}