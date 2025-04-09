package org.example.g2binc_tp2.entities;

import org.example.g2binc_tp2.enums.StatusEmploye;
import org.example.g2binc_tp2.exceptions.InvalidHireDateException;
import org.example.g2binc_tp2.exceptions.InvalidSalaryException;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * The type Conseiller.
 */
public class Conseiller extends Employe{
    private List<String> langueParlees;
    private int objectifVente;
    private double tauxCommission;

    /**
     * Instantiates a new Conseiller.
     */
    public Conseiller() {
       super();
    }

    /**
     * Instantiates a new Conseiller.
     *
     * @param idEmploye      the id employe
     * @param name           the name
     * @param surname        the surname
     * @param salary         the salary
     * @param dateEmbauche   the date embauche
     * @param status         the status
     * @param langueParlees  the langue parlees
     * @param tauxCommission the taux commission
     * @param objectifVente  the objectif vente
     * @throws InvalidSalaryException   the invalid salary exception
     * @throws InvalidHireDateException the invalid hire date exception
     */
    public Conseiller(int idEmploye, String name, String surname, double salary, LocalDate dateEmbauche, StatusEmploye status, List<String> langueParlees, double tauxCommission, int objectifVente) throws InvalidSalaryException, InvalidHireDateException {
        super(idEmploye, name, surname, salary, dateEmbauche, status);
        this.langueParlees = langueParlees;
        this.tauxCommission = tauxCommission;
        this.objectifVente = objectifVente;
    }

    /**
     * Gets langue parlees.
     *
     * @return the langue parlees
     */
    public List<String> getLangueParlees() {
        return langueParlees;
    }

    /**
     * Sets langue parlees.
     *
     * @param langueParlees the langue parlees
     */
    public void setLangueParlees(List<String> langueParlees) {
        this.langueParlees = langueParlees;
    }

    /**
     * Gets objectif vente.
     *
     * @return the objectif vente
     */
    public int getObjectifVente() {
        return objectifVente;
    }

    /**
     * Sets objectif vente.
     *
     * @param objectifVente the objectif vente
     */
    public void setObjectifVente(int objectifVente) {
        this.objectifVente = objectifVente;
    }

    /**
     * Gets taux commission.
     *
     * @return the taux commission
     */
    public double getTauxCommission() {
        return tauxCommission;
    }

    /**
     * Sets taux commission.
     *
     * @param tauxCommission the taux commission
     */
    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    @Override
    public String toString() {
        return "Conseiller{" +" => "+
                super.toString()+
                " langueParlees=" + langueParlees +
                ", objectifVente=" + objectifVente +
                ", tauxCommission=" + tauxCommission +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Conseiller that = (Conseiller) object;
        return objectifVente == that.objectifVente && Double.compare(tauxCommission, that.tauxCommission) == 0 && Objects.equals(langueParlees, that.langueParlees);
    }


}
