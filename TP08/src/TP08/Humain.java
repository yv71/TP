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
public class Humain extends Animal{
    
    public Humain(String nom) {
        super(nom);
    }
   
    public String donneCri(){
        return "Bonjour ! ";
    }
   
    public String donneEspece(){
        return "Humain";
    }

    public String donneNourriture(){
        return "DE LA VIANDE ! ";
    }
    
    
}
