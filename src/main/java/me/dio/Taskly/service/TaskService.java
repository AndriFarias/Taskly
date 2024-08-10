package me.dio.Taskly.service;

import me.dio.Taskly.domain.model.Task;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);
   Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();
    Task updateTask(Long id, Task task);
    void deleteTask(Long id);
}
