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
abstract class Chien extends Animal{
    
    public Chien(String nom) {
        super(nom);
    }
    
    public String donneCri(){
        return "WOUF";
    }
    
    public String donneEspece(){
        return "chien" + this.donneRace();
    }
    
    public String donneNourriture(){
        return "croquettes";
    }
    
    abstract String donneRace();
}
