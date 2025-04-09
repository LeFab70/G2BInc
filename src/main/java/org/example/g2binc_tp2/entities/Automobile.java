package org.example.g2binc_tp2.entities;

import java.util.Objects;

/**
 * The type Automobile.
 */
public class Automobile {
    private int numSerie;
    private String marque;
    private String modele;
    private String numPlaque;
    private double kilometrage;
    private int annee;

    /**
     * Instantiates a new Automobile.
     *
     * @param numSerie    the num serie
     * @param marque      the marque
     * @param modele      the modele
     * @param numPlaque   the num plaque
     * @param kilometrage the kilometrage
     * @param annee       the annee
     */
    public Automobile(int numSerie, String marque, String modele, String numPlaque, double kilometrage, int annee) {
        this.numSerie = numSerie;
        this.marque = marque;
        this.modele = modele;
        this.numPlaque = numPlaque;
        this.kilometrage = kilometrage;
        this.annee = annee;
    }

    /**
     * Instantiates a new Automobile.
     */
    public Automobile() {
    }

    /**
     * Gets num serie.
     *
     * @return the num serie
     */
    public int getNumSerie() {
        return numSerie;
    }

    /**
     * Sets num serie.
     *
     * @param numSerie the num serie
     */
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Gets marque.
     *
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Sets marque.
     *
     * @param marque the marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * Gets modele.
     *
     * @return the modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * Sets modele.
     *
     * @param modele the modele
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * Gets num plaque.
     *
     * @return the num plaque
     */
    public String getNumPlaque() {
        return numPlaque;
    }

    /**
     * Sets num plaque.
     *
     * @param numPlaque the num plaque
     */
    public void setNumPlaque(String numPlaque) {
        this.numPlaque = numPlaque;
    }

    /**
     * Gets kilometrage.
     *
     * @return the kilometrage
     */
    public double getKilometrage() {
        return kilometrage;
    }

    /**
     * Sets kilometrage.
     *
     * @param kilometrage the kilometrage
     */
    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    /**
     * Gets annee.
     *
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Sets annee.
     *
     * @param annee the annee
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                " numSerie=" + numSerie +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", numPlaque='" + numPlaque + '\'' +
                ", kilometrage=" + kilometrage +
                ", annee=" + annee +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Automobile that = (Automobile) object;
        return numSerie == that.numSerie && Double.compare(kilometrage, that.kilometrage) == 0 && annee == that.annee && Objects.equals(marque, that.marque) && Objects.equals(modele, that.modele) && Objects.equals(numPlaque, that.numPlaque);
    }

}
