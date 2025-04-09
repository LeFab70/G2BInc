package org.example.g2binc_tp2.interfaces;

import org.example.g2binc_tp2.entities.Task;

import java.util.List;
import java.util.Optional;

/**
 * The interface Task.
 */
public interface ITask {
    /**
     * Add task task.
     *
     * @param task the task
     * @return the task
     */
    Task addTask(Task task);

    /**
     * Delete task.
     *
     * @param idTask the id task
     */
    void deleteTask(int idTask);

    /**
     * Gets all tasks.
     *
     * @return the all tasks
     */
    List<Task> getAllTasks();

    /**
     * Gets task by id.
     *
     * @param idTask the id task
     * @return the task by id
     */
    Optional<Task> getTaskById(int idTask);

    /**
     * Update task task.
     *
     * @param task the task
     * @return the task
     */
    Task updateTask(Task task);
}
