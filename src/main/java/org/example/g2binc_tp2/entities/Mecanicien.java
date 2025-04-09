package org.example.g2binc_tp2.entities;

import org.example.g2binc_tp2.enums.StatusEmploye;
import org.example.g2binc_tp2.exceptions.InvalidHireDateException;
import org.example.g2binc_tp2.exceptions.InvalidSalaryException;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * The type Mecanicien.
 */
public class Mecanicien extends Employe{
    private List<String> certifications;

    /**
     * Instantiates a new Mecanicien.
     *
     * @param idEmploye      the id employe
     * @param name           the name
     * @param surname        the surname
     * @param salary         the salary
     * @param dateEmbauche   the date embauche
     * @param status         the status
     * @param certifications the certifications
     * @throws InvalidSalaryException   the invalid salary exception
     * @throws InvalidHireDateException the invalid hire date exception
     */
    public Mecanicien(int idEmploye, String name, String surname, double salary, LocalDate dateEmbauche, StatusEmploye status, List<String> certifications) throws InvalidSalaryException, InvalidHireDateException {
        super(idEmploye, name, surname, salary, dateEmbauche, status);
        this.certifications = certifications;
    }

    /**
     * Instantiates a new Mecanicien.
     */
    public Mecanicien() {
    }

    /**
     * Gets certifications.
     *
     * @return the certifications
     */
    public List<String> getCertifications() {
        return certifications;
    }

    /**
     * Sets certifications.
     *
     * @param certifications the certifications
     */
    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    @Override
    public String toString() {
        return "Mecanicien {" +" => "+
                super.toString()+
                "certifications=" + certifications +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Mecanicien that = (Mecanicien) object;
        return Objects.equals(certifications, that.certifications);
    }

}
