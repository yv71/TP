/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP08;

/**
 *
 * @author yv066840
 */
public class Bestioles {
    private java.util.ArrayList<Animal> liste;
    
    public Bestioles(){
        liste = new java.util.ArrayList<Animal>();
    }
    
    /**
     * 
     * @return nimbre d'animaux de la liste
     */
    public int nbAnimaux(){
        return liste.size();
    }
    
    public String toString(){
        return liste.toString();
    }
    
    public Animal ajouteAnimal(String nom, String type){
        Animal bete = Fabrique.cree(nom, type);
        liste.add(bete);
        return bete;
    }
    
   public boolean animalPresent (Animal bete){
       return liste.contains(bete);
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
}
