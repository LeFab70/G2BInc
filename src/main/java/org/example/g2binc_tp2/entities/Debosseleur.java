package org.example.g2binc_tp2.entities;

import org.example.g2binc_tp2.enums.StatusEmploye;
import org.example.g2binc_tp2.exceptions.InvalidHireDateException;
import org.example.g2binc_tp2.exceptions.InvalidSalaryException;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * The type Debosseleur.
 */
public class Debosseleur extends Employe{
    private List<String> specialisations;

    /**
     * Instantiates a new Debosseleur.
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
    public Debosseleur(int idEmploye, String name, String surname, double salary, LocalDate dateEmbauche, StatusEmploye status) throws InvalidSalaryException, InvalidHireDateException {
        super(idEmploye, name, surname, salary, dateEmbauche, status);
    }

    /**
     * Instantiates a new Debosseleur.
     */
    public Debosseleur() {
        super();
    }

    /**
     * Gets specialisations.
     *
     * @return the specialisations
     */
    public List<String> getSpecialisations() {
        return specialisations;
    }

    /**
     * Sets specialisations.
     *
     * @param specialisations the specialisations
     */
    public void setSpecialisations(List<String> specialisations) {
        this.specialisations = specialisations;
    }

    @Override
    public String toString() {
        return "Debosseleur{" +"=>"+
                super.toString()+
                "specialisations=" + specialisations +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Debosseleur that = (Debosseleur) object;
        return Objects.equals(specialisations, that.specialisations);
    }


}
