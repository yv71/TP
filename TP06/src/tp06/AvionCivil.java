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
public class AvionCivil extends Avion{
    private int nbPassagers;
    /**
     * 
     * @param nom nom de l'avion
     */
    public AvionCivil(String nom) {
        super(nom);
        this.nbPassagers=0;
    }
    /**
     * 
     * @param nb nombre de passager à ajouter à l'avion
     */
    public void ajouterPassagers(int nb){
        this.nbPassagers += nb;
    }
    /**
     * 
     * @param nb nombre de passager à retirer de l'avion
     */
    public void sortirPassagers (int nb){
        if (this.nbPassagers < nb){
            this.nbPassagers =0;
        }
        else {
            this.nbPassagers -= nb;
        }
    }
    /**
     * 
     * @return les informations de l'avion
     */
    public String toString(){
        return super.toString() + " Nb passagers : "+ this.nbPassagers;
    }
}
