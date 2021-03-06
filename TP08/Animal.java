/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP08;

import java.util.Objects;

/**
 *
 * @author yv066840
 */
abstract class Animal {
    protected String nom;
    
    public Animal(String nom){
        this.nom = nom;
    }
    
    protected String donneNom(){
        return this.nom;
    }
    
    abstract String donneEspece();
    
    abstract String donneNourriture();

    abstract String donneCri();
    
    public String toString(){
        return this.donneCri()+" ! Je m'appelle " + this.donneNom()+ ", je suis un " + this.donneEspece()+ "\nJe mange principalement : "+ this.donneNourriture() + ".\n";
    }


    
    
}
