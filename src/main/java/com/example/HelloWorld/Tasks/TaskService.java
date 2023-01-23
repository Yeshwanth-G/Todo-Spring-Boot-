package com.example.HelloWorld.Tasks;
import com.example.HelloWorld.Repos.TaskRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
//handles logic also called view
@Component
public class TaskService {
    @Autowired
    TaskRepo taskRepo;
    TaskService(){
        System.out.println("Task Service Created....");
    }
    public List<Task> getAllTasks(){
        return (List<Task>) taskRepo.findAll();
    }
    public @ResponseBody String AddTask(Task ts){
        try {
            taskRepo.save(ts);
        }catch(Exception err){
            return "failed"+err.getMessage();
        }
        return "done";
    }

    @Transactional
    public @ResponseBody String updateTask(Task ts, int id){
        Task old_task=taskRepo.findById(id).get();
        old_task.setDescription(ts.getDescription());
        old_task.setMg(ts.getMg());
        old_task.setStatus(ts.getStatus());
        old_task.setCreated_at(ts.getCreated_at());
        return "done";
    }
    public  String deleteTask(int id){
        return "dd";
    }
}