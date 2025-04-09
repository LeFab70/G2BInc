package org.example.g2binc_tp2.entities;

import java.util.Objects;

/**
 * The type Task.
 */
public class Task {
    private int idTask;
    private String nameTask;
    private double basicCost;

    /**
     * Instantiates a new Task.
     *
     * @param idTask    the id task
     * @param nameTask  the name task
     * @param basicCost the basic cost
     */
    public Task(int idTask, String nameTask, double basicCost) {
        this.idTask = idTask;
        this.nameTask = nameTask;
        this.basicCost = basicCost;
    }

    /**
     * Instantiates a new Task.
     */
    public Task() {
    }

    /**
     * Gets id task.
     *
     * @return the id task
     */
    public int getIdTask() {
        return idTask;
    }

    /**
     * Sets id task.
     *
     * @param idTask the id task
     */
    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    /**
     * Gets name task.
     *
     * @return the name task
     */
    public String getNameTask() {
        return nameTask;
    }

    /**
     * Sets name task.
     *
     * @param nameTask the name task
     */
    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    /**
     * Gets basic cost.
     *
     * @return the basic cost
     */
    public double getBasicCost() {
        return basicCost;
    }

    /**
     * Sets basic cost.
     *
     * @param basicCost the basic cost
     */
    public void setBasicCost(double basicCost) {
        this.basicCost = basicCost;
    }

    @Override
    public String toString() {
        return "Task{" +
                " idTask=" + idTask +
                ", nameTask='" + nameTask + '\'' +
                ", basicCost=" + basicCost +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Task task = (Task) object;
        return idTask == task.idTask && Double.compare(basicCost, task.basicCost) == 0 && Objects.equals(nameTask, task.nameTask);
    }


}
