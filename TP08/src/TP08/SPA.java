/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP08;
import java.util.ArrayList;
/**
 *
 * @author yv066840
 */
public class SPA {
    private java.util.ArrayList<Animal> Animaux;
    private String nom;
    
    public SPA (String n){
        Animaux = new java.util.ArrayList();
        nom = n;
    }
    
    public void Trouve(Animal a){
        Animaux.add(a);
    }
    
    public void Adopte(Animal a){
        Animaux.remove(a);
    }
    
    public String toString(){
        return "Liste des animaux à adopter de la SPA de "+ nom + "\n" +  Animaux.toString();
    }
}
