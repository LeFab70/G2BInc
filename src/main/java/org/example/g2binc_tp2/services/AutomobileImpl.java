package org.example.g2binc_tp2.services;

import org.example.g2binc_tp2.entities.Automobile;
import org.example.g2binc_tp2.interfaces.IAutomobile;

import java.util.List;
import java.util.Optional;

public class AutomobileImpl implements IAutomobile {
    @Override
    public Automobile addAuto(Automobile automobile) {
        return null;
    }

    @Override
    public void removeAuto(int numSerie) {

    }

    @Override
    public Automobile updateAuto(Automobile automobile) {
        return null;
    }

    @Override
    public List<Automobile> getAllAuto() {
        return List.of();
    }

    @Override
    public Optional<Automobile> getAutoById(int numSerie) {
        return Optional.empty();
    }
}
