/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;

import java.util.Vector;

/**
 *
 * @author Beelzed
 */
public class Aeroport {
    private Vector<AvionMilitaire> AvionMil;
    private Vector<AvionCargo> AvionCar;
    private Vector<AvionCivil> AvionCiv;
    /**
     * constructeur de l'avion
     */
    public Aeroport(){
        AvionMil = new Vector<AvionMilitaire>();
        AvionCar = new Vector<AvionCargo>();
        AvionCiv = new Vector<AvionCivil>();
    }
    /**
     * 
     * @param avCar avion cargo à ajouter à l'aéroport 
     */
    public void ajouteAvionCargo(AvionCargo avCar){
        AvionCar.add(avCar);
    }
    /**
     * 
     * @param avMil avion militaire à ajouter à l'aéroport
     */
    public void ajouteAvionMil(AvionMilitaire avMil){
        AvionMil.add(avMil);
    }
    /**
     * 
     * @param avCiv avion civil à ajouter à l'aéroport
     */
    public void ajouteAvionCiv(AvionCivil avCiv){
        AvionCiv.add(avCiv);
    }
    /**
     * 
     * @return les informations de l'aeroport
     */
    public String toString(){
        return "Liste Avion Militaire : " + AvionMil.toString() + "\nListe Avion Cargo : " + AvionCar.toString() + "\nListe Avion Civil :"+ AvionCiv.toString();
    }
}
