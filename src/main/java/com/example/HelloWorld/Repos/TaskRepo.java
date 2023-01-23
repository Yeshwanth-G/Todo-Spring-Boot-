package com.example.HelloWorld.Repos;
import com.example.HelloWorld.Tasks.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task,Integer> {

}
