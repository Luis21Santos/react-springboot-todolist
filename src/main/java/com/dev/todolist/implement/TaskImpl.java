package com.dev.todolist.implement;

import lombok.AllArgsConstructor;
import com.dev.todolist.dto.TaskDto;
import com.dev.todolist.models.Task;
import com.dev.todolist.repository.TaskRepository;
import com.dev.todolist.services.TaskServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class TaskImpl implements TaskServices{

    private TaskRepository taskRepository;

    //get all tasks
    @Override
    public List<TaskDto> getAllTasks(){
    }

    //create new task
    @Override
    public TaskDto createTask(TaskDto task) {
    }

    //get task by id
    @Override
    public TaskDto getTaskById(Long task) {
    }

    //update task
    @Override
    public TaskDto updateTask(Long id, TaskDto task) {
    }

    @Override
    public void deleteTask(Long id) {

    }
}