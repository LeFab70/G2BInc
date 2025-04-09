package org.example.g2binc_tp2.entities;

import org.example.g2binc_tp2.enums.StatusTask;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The type Execute task.
 */
public class ExecuteTask {
    private LocalDate dateTask;
    private StatusTask status;
    private double nbLaborHour;
    // Références aux autres entités
    private Automobile automobile;  // L'automobile concernée
    private Employe employe;        // L’employé qui exécute la tâche
    private Task task;              // La tâche de base exécutée

    private int idOperation;
    /**
     * Instantiates a new Execute task.
     *
     * @param dateTask    the date task
     * @param status      the status
     * @param nbLaborHour the nb labor hour
     * @param task        the task
     * @param automobile  the automobile
     * @param employe     the employe
     */
    public ExecuteTask(int idOperation,LocalDate dateTask, StatusTask status, double nbLaborHour, Task task, Automobile automobile, Employe employe) {
        this.dateTask = dateTask;
        this.status = status;
        this.nbLaborHour = nbLaborHour;
        this.task = task;
        this.automobile = automobile;
        this.employe = employe;
        this.idOperation=idOperation;
    }

    /**
     * Instantiates a new Execute task.
     */
    public ExecuteTask() {
    }

    /**
     * Gets date task.
     *
     * @return the date task
     */
    public LocalDate getDateTask() {
        return dateTask;
    }

    /**
     * Sets date task.
     *
     * @param dateTask the date task
     */
    public void setDateTask(LocalDate dateTask) {
        this.dateTask = dateTask;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public StatusTask getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(StatusTask status) {
        this.status = status;
    }

    /**
     * Gets nb labor hour.
     *
     * @return the nb labor hour
     */
    public double getNbLaborHour() {
        return nbLaborHour;
    }

    /**
     * Sets nb labor hour.
     *
     * @param nbLaborHour the nb labor hour
     */
    public void setNbLaborHour(double nbLaborHour) {
        this.nbLaborHour = nbLaborHour;
    }

    /**
     * Gets task.
     *
     * @return the task
     */
    public Task getTask() {
        return task;
    }

    /**
     * Sets task.
     *
     * @param task the task
     */
    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * Gets automobile.
     *
     * @return the automobile
     */
    public Automobile getAutomobile() {
        return automobile;
    }

    /**
     * Sets automobile.
     *
     * @param automobile the automobile
     */
    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }

    /**
     * Gets employe.
     *
     * @return the employe
     */
    public Employe getEmploye() {
        return employe;
    }

    /**
     * Sets employe.
     *
     * @param employe the employe
     */
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public int getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(int idOperation) {
        this.idOperation = idOperation;
    }

    @Override
    public String toString() {
        return " ExecuteTask{" +
                " dateTask=" + dateTask +
                ", status=" + status +
                ", nbLaborHour=" + nbLaborHour +
                ", automobile=" + automobile +
                ", employe=" + employe +
                ", task=" + task +
                ", idOperation=" + idOperation +
                '}';
    }



    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        ExecuteTask that = (ExecuteTask) object;
        return Double.compare(nbLaborHour, that.nbLaborHour) == 0 && Objects.equals(dateTask, that.dateTask) && status == that.status && Objects.equals(task, that.task) && Objects.equals(automobile, that.automobile) && Objects.equals(employe, that.employe);
    }


}
