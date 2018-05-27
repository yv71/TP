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
public class Chat extends Animal{

    public Chat(String nom) {
        super(nom);
    }
    
    public String donneEspece(){
        return "chat";
    }
     public String donneNourriture(){
         return "croquettes";
     }
     public String donneCri(){
         return "miaou";
     }
}
