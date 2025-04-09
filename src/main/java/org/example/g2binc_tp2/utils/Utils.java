package org.example.g2binc_tp2.utils;

import org.example.g2binc_tp2.exceptions.InvalidHireDateException;
import org.example.g2binc_tp2.exceptions.KilometrageException;

import java.time.LocalDate;

public class Utils {
    public static void validateKilometrage(double newKm, double oldKm) throws KilometrageException {
        if (newKm < oldKm) {
            throw new KilometrageException("Le kilométrage ne peut pas être inférieur à l'ancien kilométrage");
        }
    }

    public static void validateAnnee(int annee) throws InvalidHireDateException {
        int currentYear = LocalDate.now().getYear();
        if (annee > currentYear) {
            throw new InvalidHireDateException("Année d'acquisition invalide : " + annee);
        }
    }
}
