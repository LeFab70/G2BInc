package org.example.g2binc_tp2.services;

import org.example.g2binc_tp2.entities.Employe;
import org.example.g2binc_tp2.exceptions.EmployeNotFoundException;
import org.example.g2binc_tp2.interfaces.IEmploye;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeImpl implements IEmploye
{

        private final List<Employe> employes = new ArrayList<>();

        @Override
        public void addEmployee(Employe emp) {
            if (emp == null) {
                throw new IllegalArgumentException("Merci de fournir un employé");
            }

            boolean exists = employes.stream()
                    .anyMatch(e -> e.getIdEmploye() == emp.getIdEmploye());

            if (exists) {
                throw new IllegalArgumentException("Un employé avec cet ID existe déjà");
            }

            if (emp.getSalary() < 0) {
                throw new IllegalArgumentException("Le salaire ne peut pas être négatif");
            }

            employes.add(emp);
        }

        @Override
        public Employe getEmployeeById(int idEmployee) throws EmployeNotFoundException {
            return employes.stream()
                    .filter(e -> e.getIdEmploye() == idEmployee)
                    .findFirst()
                    .orElseThrow(()->new EmployeNotFoundException("Employe not found"));
        }

        @Override
        public void updateEmployee(Employe emp) throws EmployeNotFoundException {
            if (emp == null) {
                throw new IllegalArgumentException("Merci de fournir un employé");
            }

            Employe existing = getEmployeeById(emp.getIdEmploye());
            if (emp.getSalary() < 0) {
                throw new IllegalArgumentException("Salaire négatif non autorisé");
            }
            int index = employes.indexOf(existing);
            employes.set(index, emp);
        }

        @Override
        public void deleteEmployee(int idEmployee) {
            employes.removeIf(e -> e.getIdEmploye() == idEmployee);
        }

        @Override
        public List<Employe> getAllEmployees() {
            return new ArrayList<>(employes); // copie défensive
        }


}
