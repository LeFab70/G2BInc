package org.example.g2binc_tp2.interfaces;

import org.example.g2binc_tp2.entities.Automobile;

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
    Automobile addAuto(Automobile automobile);

    /**
     * Remove auto.
     *
     * @param numSerie the num serie
     */
    void removeAuto(int numSerie);

    /**
     * Update auto automobile.
     *
     * @param automobile the automobile
     * @return the automobile
     */
    Automobile updateAuto(Automobile automobile);

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
    Optional<Automobile> getAutoById(int numSerie);
}
