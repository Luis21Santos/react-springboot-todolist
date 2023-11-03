package com.dev.todolist.controller;

//importando arquivos e recursos do Springboot
import lombok.AllArgsConstructor;
import com.dev.todolist.dto.TaskDto;
import com.dev.todolist.exception.NotFoundException;
import com.dev.todolist.models.Task;
import com.dev.todolist.repository.TaskRepository;
import com.dev.todolist.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {
  
  private TaskServices taskServices;

  //get all tasks
  @GetMapping
  public ResponseEntity<List<TaskDto>> getAllTasks(){
      List<TaskDto> tasks = taskServices.getAllTasks();
      return ResponseEntity.ok(tasks);
  }

      
  // build create task REST API
  @PostMapping
  public ResponseEntity<TaskDto> createTasks(@RequestBody TaskDto task) {
      TaskDto TaskDto = taskServices.createTask(task);
      return new ResponseEntity<>(TaskDto, HttpStatus.CREATED);
  }

  // get task by id
  @GetMapping("{id}")
  public ResponseEntity<TaskDto> gettaskById(@PathVariable("id") Long id){
      TaskDto task = taskServices.getTaskById(id);
      return ResponseEntity.ok(task);
  }

  // update task
  @PutMapping("{id}")
  public ResponseEntity<TaskDto> updateTask(@PathVariable("id") Long id,
      @RequestBody TaskDto taskDetalhes) {
      TaskDto taskAtualizado = taskServices.updateTask(id, taskDetalhes);
      return ResponseEntity.ok(taskAtualizado);
  }

  //  delete task 
  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteTask(@PathVariable("id") Long id){
      taskServices.deleteTask(id);
      return ResponseEntity.ok("Task deletado com sucesso");
  
  }
  }