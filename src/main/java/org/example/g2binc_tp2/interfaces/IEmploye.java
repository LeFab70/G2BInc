package org.example.g2binc_tp2.interfaces;

import org.example.g2binc_tp2.entities.Employe;

import java.util.List;
import java.util.Optional;

/**
 * The interface Employe.
 */
public interface IEmploye {
    /**
     * Add employee.
     *
     * @param emp the emp
     */
    void addEmployee(Employe emp);

    /**
     * Gets employee by id.
     *
     * @param idEmployee the id employee
     * @return the employee by id
     */
    Optional<Employe> getEmployeeById(int idEmployee);

    /**
     * Update employee.
     *
     * @param emp the emp
     */
    void updateEmployee(Employe emp);

    /**
     * Delete employee.
     *
     * @param idEmployee the id employee
     */
    void deleteEmployee(int idEmployee);

    /**
     * Gets all employees.
     *
     * @return the all employees
     */
    List<Employe> getAllEmployees();
}
