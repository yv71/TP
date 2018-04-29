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
public class Ravitailleur extends AvionMilitaire {
    private double fuel;
/**
 * 
 * @param nom nom de l'avion
 */
    public Ravitailleur(String nom) {
        super(nom);
        this.fuel = 0;
    }
    /**
     * 
     * @param fuel quantité de fuel à ajouter à l'avion
     */
   public void chargerFuel (double fuel){
       this.fuel += fuel;
   }
   /**
    * 
    * @param fuel quantité de fuel à retirer de l'avion
    */
   public void transfererFuel (double fuel){
        if (fuel > this.fuel){
            this.fuel=0;
        }
        else {
            this.fuel -= fuel;
        }
   }
   /**
    * 
    * @return les informations de l'avion
    */
   public String toString(){
       return super.toString() + " Fuel : " + this.fuel;
   }
}
