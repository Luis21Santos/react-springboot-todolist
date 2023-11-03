package com.dev.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.todolist.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // all crud database methods
}
