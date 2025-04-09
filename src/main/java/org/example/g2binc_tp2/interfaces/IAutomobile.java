package org.example.g2binc_tp2.interfaces;

import org.example.g2binc_tp2.entities.Automobile;
import org.example.g2binc_tp2.exceptions.AutoNotFoundException;
import org.example.g2binc_tp2.exceptions.InvalidHireDateException;
import org.example.g2binc_tp2.exceptions.KilometrageException;

import java.util.List;
import java.util.Optional;

/**
 * The interface Automobile.
 */
public interface IAutomobile {
    /**
     * Add auto automobile.
     *
     * @param automobile the automobile
     * @return the automobile
     */
    Automobile addAuto(Automobile automobile) throws AutoNotFoundException;

    /**
     * Remove auto.
     *
     * @param numSerie the num serie
     */
    void removeAuto(int numSerie) throws AutoNotFoundException;

    /**
     * Update auto automobile.
     *
     * @param automobile the automobile
     * @return the automobile
     */
    Automobile updateAuto(Automobile automobile) throws AutoNotFoundException, KilometrageException, InvalidHireDateException;

    /**
     * Gets all auto.
     *
     * @return the all auto
     */
    List<Automobile> getAllAuto();

    /**
     * Gets auto by id.
     *
     * @param numSerie the num serie
     * @return the auto by id
     */
    Automobile getAutoById(int numSerie) throws AutoNotFoundException;
}
