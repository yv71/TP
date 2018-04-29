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
public class AvionCargo extends Avion {
    private Vector<String> cargaison;
    /**
     * 
     * @param nom nom de l'avion
     */
    public AvionCargo(String nom) {
        super(nom);
        this.cargaison = new Vector<String>();
    }
     /**
      * 
      * @param carg cargaison à ajouter à l'avion
      */
    public void addCargaison(String carg){
        this.cargaison.add(carg);
    }
    /**
     * 
     * @return la liste de la cargaison de l'avion
     */
    public String getCargaison(){
        return this.cargaison.toString();
    }
    /**
     * 
     * @return les informations de l'avion
     */
    public String toString(){
        return super.toString()+ " Cargaison : " + this.getCargaison();
    }
}
