package org.example.g2binc_tp2.services;

import org.example.g2binc_tp2.entities.ExecuteTask;
import org.example.g2binc_tp2.interfaces.IExecuteTask;

import java.util.ArrayList;
import java.util.List;

public class ExcecuteTaskImpl implements IExecuteTask {
    private final List<ExecuteTask> executeTasks = new ArrayList<>();

    @Override
    public void addExecuteTask(ExecuteTask task) {
        if (task == null) {
            throw new IllegalArgumentException("Merci de fournir une tâche à exécuter");
        }

        boolean alreadyExists = executeTasks.stream()
                .anyMatch(t -> t.getIdOperation() == task.getIdOperation());

        if (alreadyExists) {
            throw new IllegalArgumentException("Une tâche exécutée avec cet ID existe déjà");
        }

        executeTasks.add(task);
    }

    @Override
    public ExecuteTask getExecuteTaskById(int id) {
        return executeTasks.stream()
                .filter(t -> t.getIdOperation() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Aucune tâche exécutée avec cet ID"));
    }

    @Override
    public void updateExecuteTask(ExecuteTask task) {
        if (task == null) {
            throw new IllegalArgumentException("Merci de fournir une tâche à mettre à jour");
        }

        ExecuteTask existingTask = getExecuteTaskById(task.getIdOperation());
        int index = executeTasks.indexOf(existingTask);
        executeTasks.set(index, task);
    }

    @Override
    public void deleteExecuteTask(int id) {
        boolean removed = executeTasks.removeIf(task -> task.getIdOperation() == id);
        if (!removed) {
            throw new IllegalArgumentException("Impossible de supprimer : ID inexistant");
        }
    }

    @Override
    public List<ExecuteTask> getAllExecuteTasks() {
        return new ArrayList<>(executeTasks);
    }
}
