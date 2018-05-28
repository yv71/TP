/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP08;

import java.io.Serializable;

/**
 *
 * @author yv066840
 */
public class Bestioles implements Serializable {
    private java.util.ArrayList<Animal> liste;
    
    public Bestioles(){
        liste = new java.util.ArrayList<Animal>();
    }
    
    /**
     * 
     * @return nombre d'animaux de la liste
     */
    public int nbAnimaux(){
        return liste.size();
    }
    
    
    public String toString(){
        return liste.toString();
    }
    
    /**
     * 
     * @param nom nom de l'animal à ajouter/creer
     * @param type type de l'animal à ajouter/creer
     * @return l'animal cree
     */
    public Animal ajouteAnimal(String nom, String type){
        Animal bete = Fabrique.cree(nom, type);
        liste.add(bete);
        return bete;
    }
    
    /**
     * 
     * @param bete
     * @return 
     */
   public boolean animalPresent (Animal bete){
       boolean test = false;
       for (Animal b : liste){
           if (bete.donneEspece()==b.donneEspece() && bete.donneNom()==b.donneNom()){
               test = true;
           }
           
       }
       return test;
   }
   
   public void enleveAnimal(int numero){
       if (liste.size()-1 <= numero){
           liste.remove(numero);
       }
   }
   
   public void enleveAnimal(Animal bete){
       if (animalPresent(bete)){
           liste.remove(bete);
       }
   }
   
   public String toString(int i){
       return liste.get(i).toString();
   }
   
   public Animal retourneAnimal(int i){
       Animal retour = null;
       if (this.liste.size()-1>= i){
           retour = this.liste.get(i);
       }
       
       return retour;
   }
   
   public void ajouteAnimal(Animal a){
       this.liste.add(a);
   }
   
   public Animal retourneLast(){
       Animal retour = null;
       if (this.liste.size()>0){
           retour = this.retourneAnimal(this.nbAnimaux()-1);
       }
       return retour;
   }
}
