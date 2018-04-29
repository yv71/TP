/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;

/**
 *
 * @author Beelzed
 */
public class Chasse extends AvionMilitaire{
    private int missiles;
    
    /**
     * 
     * @param nom nom de l'avion 
     */
    public Chasse(String nom) {
        super(nom);
        this.missiles = 0;
    }
     /**
      * 
      * @param nb nb de missiles à charger dans l'avion
      */
    public void chargerMissile(int nb){
        this.missiles += nb;
    }
    /**
     *
     * @param nb nb de missile à tirer
     */
    public void lancerMissile(int nb){
        if (nb > this.missiles){
            this.missiles=0;
        }
        else {
            this.missiles -= nb;
        }
    }
    /**
     * 
     * @return les informations de l'avion
     */
    public String toString(){
        return super.toString() + " Missiles : " + this.missiles;
    }
}
