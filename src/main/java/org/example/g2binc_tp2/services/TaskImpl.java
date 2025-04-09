package org.example.g2binc_tp2.services;

import org.example.g2binc_tp2.entities.Task;
import org.example.g2binc_tp2.exceptions.TaskNotFoundException;
import org.example.g2binc_tp2.interfaces.ITask;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskImpl implements ITask {
    List<Task> tasks=new ArrayList<>();

    @Override
    public Task addTask(Task task) {

        if (task==null)
            throw new IllegalArgumentException("merci de fournir la task");
        boolean isExist=tasks.stream().anyMatch(task1 -> task1.equals(task));
        if (isExist)
            throw new IllegalArgumentException("La task est deja dans la liste");
        tasks.add(task);
        return task;
    }

    @Override
    public void deleteTask(int idTask) {
      tasks.removeIf(task -> task.getIdTask()==idTask);
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks==null? new ArrayList<>():tasks;
    }

    @Override
    public Task getTaskById(int idTask) throws TaskNotFoundException {
       return tasks.stream()
                .filter(task1 -> task1.getIdTask()==idTask)
                .findFirst()
                .orElseThrow(()->new TaskNotFoundException("Task not found"));

    }

    @Override
    public Task updateTask(Task task) {
        if(task==null)
            throw new IllegalArgumentException("fournir la task à update");
        if(tasks.stream().noneMatch(task1 -> task1.equals(task)))
            throw new IllegalArgumentException("la tache n'existe pas");
        int index=tasks.indexOf(task);
        tasks.set(index,task);
        return task;
    }
}
