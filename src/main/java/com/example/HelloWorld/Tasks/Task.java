package com.example.HelloWorld.Tasks;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int task_id;
    @CreationTimestamp
    private LocalDateTime created_at;
    private String description;

    private int mg;
    private int status;//0-p,1-c;

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }

    public Task(){
        System.out.println("Task Created....");
    }
    public Task(int task_id, LocalDateTime created_at, String description, int status) {
        this.task_id = task_id;
        this.created_at = created_at;
        this.description = description;
        this.status = status;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
