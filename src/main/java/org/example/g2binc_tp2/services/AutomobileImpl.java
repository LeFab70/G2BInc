package org.example.g2binc_tp2.services;

import org.example.g2binc_tp2.entities.Automobile;
import org.example.g2binc_tp2.exceptions.AutoNotFoundException;
import org.example.g2binc_tp2.exceptions.InvalidHireDateException;
import org.example.g2binc_tp2.exceptions.KilometrageException;
import org.example.g2binc_tp2.interfaces.IAutomobile;
import org.example.g2binc_tp2.utils.Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AutomobileImpl implements IAutomobile {
   private final List<Automobile> listAuto=new ArrayList<>();


    @Override
    public Automobile addAuto(Automobile automobile) throws AutoNotFoundException {

        if (automobile==null)
            throw new IllegalArgumentException("merci de fournir l'auto");
        //Verfier si auto deja dans la liste
        //Automobile auto=getAutoById(automobile.getNumSerie()); pas bon car lauto nexist pas au debut et on aura exception
        boolean isExist=listAuto.stream().anyMatch(automobile1 -> automobile1.equals(automobile));
        if (isExist)
            throw new IllegalArgumentException("L'auto est deja dans la liste");
        listAuto.add(automobile);
        return automobile;
    }

    @Override
    public void removeAuto(int numSerie) throws AutoNotFoundException {
//     Automobile autoToFound=getAutoById(numSerie);
//     if(autoToFound!=null) listAuto.remove(autoToFound);
     listAuto.removeIf((auto)->auto.getNumSerie()==numSerie);

    }

    @Override
    public Automobile updateAuto(Automobile automobile) throws AutoNotFoundException, KilometrageException, InvalidHireDateException {
        if (automobile == null)
            throw new IllegalArgumentException("Merci de fournir une automobile à mettre à jour");

        Automobile autoToFound=getAutoById(automobile.getNumSerie()); //Check si auto exist dans la liste

       //Validations
        Utils.validateAnnee(automobile.getAnnee());
        Utils.validateKilometrage(automobile.getKilometrage(), autoToFound.getKilometrage());

        listAuto.set(listAuto.indexOf(autoToFound), automobile); //MAJ Auto
        return automobile;
    }

    @Override
    public List<Automobile> getAllAuto() {
        return listAuto!=null?listAuto:new ArrayList<>();
    }

    @Override
    public Automobile getAutoById(int numSerie) throws AutoNotFoundException {

        return listAuto.stream()
                .filter(automobile -> automobile.getNumSerie()==(numSerie))
                .findFirst()
                .orElseThrow(()->new AutoNotFoundException("Auto not found"));//Optional.ofNullable(auto);

    }
}
