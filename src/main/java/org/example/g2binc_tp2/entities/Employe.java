package org.example.g2binc_tp2.entities;

import org.example.g2binc_tp2.enums.StatusEmploye;
import org.example.g2binc_tp2.exceptions.InvalidHireDateException;
import org.example.g2binc_tp2.exceptions.InvalidSalaryException;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The type Employe.
 */
public abstract class Employe {
    private int idEmploye;
    private String name;
    private String surname;
    private double salary;
    private LocalDate dateEmbauche;
    private StatusEmploye status;

    /**
     * Instantiates a new Employe.
     *
     * @param idEmploye    the id employe
     * @param name         the name
     * @param surname      the surname
     * @param salary       the salary
     * @param dateEmbauche the date embauche
     * @param status       the status
     * @throws InvalidSalaryException   the invalid salary exception
     * @throws InvalidHireDateException the invalid hire date exception
     */
    public Employe(int idEmploye, String name, String surname, double salary, LocalDate dateEmbauche, StatusEmploye status) throws InvalidSalaryException, InvalidHireDateException {
        if (salary < 0) throw new InvalidSalaryException("Salaire négatif non autorisé.");
        if (dateEmbauche.isAfter(LocalDate.now())) throw new InvalidHireDateException(dateEmbauche+" Valeur de date incorrect");

        this.idEmploye = idEmploye;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.dateEmbauche = dateEmbauche;
        this.status = status;
    }

    /**
     * Instantiates a new Employe.
     */
    public Employe(){}

    //Getter and setter


    /**
     * Gets id employe.
     *
     * @return the id employe
     */
    public int getIdEmploye() {
        return idEmploye;
    }

    /**
     * Sets id employe.
     *
     * @param idEmploye the id employe
     */
    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets surname.
     *
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets surname.
     *
     * @param surname the surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     * @throws InvalidSalaryException the invalid salary exception
     */
    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) throw new InvalidSalaryException("Salaire négatif non autorisé.");
        this.salary = salary;
    }

    /**
     * Gets date embauche.
     *
     * @return the date embauche
     */
    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    /**
     * Sets date embauche.
     *
     * @param dateEmbauche the date embauche
     * @throws InvalidHireDateException the invalid hire date exception
     */
    public void setDateEmbauche(LocalDate dateEmbauche) throws InvalidHireDateException {
        if (dateEmbauche.isAfter(LocalDate.now())) throw new InvalidHireDateException(dateEmbauche+" Valeur de date incorrect");
        this.dateEmbauche = dateEmbauche;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public StatusEmploye getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(StatusEmploye status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employe { "  +
                "idEmploye=" + idEmploye +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", dateEmbauche=" + dateEmbauche +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Employe employe = (Employe) object;
        return idEmploye == employe.idEmploye && Double.compare(salary, employe.salary) == 0 && Objects.equals(name, employe.name) && Objects.equals(surname, employe.surname) && Objects.equals(dateEmbauche, employe.dateEmbauche) && status == employe.status;
    }

}
