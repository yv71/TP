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
public class AvionMilitaire extends Avion{
    private Vector<String> mission;
/**
 * 
 * @param nom nom de l'avion
 */
    public AvionMilitaire(String nom) {
        super(nom);
        this.mission = new Vector<String>();
    }
    /**
     * 
     * @param mission mission à ajouter à l'avion
     */
    public void addMission (String mission){
        this.mission.add(mission);
    }
     /**
      * 
      * @return la liste des missions de l'avion
      */
    public String getMission(){
        return this.mission.toString();
    }
    /**
     * 
     * @return les informations de l'avion
     */
    public String toString(){
        return super.toString() + " Mission : " + this.getMission();
    }
    
}

