package org.example.g2binc_tp2.interfaces;

import org.example.g2binc_tp2.entities.ExecuteTask;

import java.util.List;

/**
 * The interface Execute task.
 */
public interface IExecuteTask {

    /**
     * Add execute task.
     *
     * @param task the task
     */
    void addExecuteTask(ExecuteTask task);

    /**
     * Gets execute task by id.
     *
     * @param id the id
     * @return the execute task by id
     */
    ExecuteTask getExecuteTaskById(int id);

    /**
     * Update execute task.
     *
     * @param task the task
     */
    void updateExecuteTask(ExecuteTask task);

    /**
     * Delete execute task.
     *
     * @param id the id
     */
    void deleteExecuteTask(int id);

    /**
     * Gets all execute tasks.
     *
     * @return the all execute tasks
     */
    List<ExecuteTask> getAllExecuteTasks();
}
