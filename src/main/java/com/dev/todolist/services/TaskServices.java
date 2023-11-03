package com.dev.todolist.services;

import com.dev.todolist.dto.TaskDto;
import java.util.List;

public interface TaskServices {
  //get all tasks
    List<TaskDto> getAllTasks();

    //post new task
    TaskDto createTask(TaskDto task);

    //get task by id
    TaskDto getTaskById(Long id);

    //update task
    TaskDto updateTask(Long id, TaskDto TaskDto);

    //delete task
    void deleteTask(Long id);
  
}
