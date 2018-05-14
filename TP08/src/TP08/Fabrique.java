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
public class Fabrique {
 
    public static Animal cree(String nom, String type){
        Animal bete;
        switch(type.toLowerCase()){
            case "cocker": bete = new Cocker(nom);
            break;
            case "berger" : bete = new Berger(nom);
            break;
            case "aigle" : bete = new Aigle(nom);
            break;
            case "vautour" : bete = new Vautour(nom);
            break;
            case "humain" : bete = new Humain(nom);
            break;
            case "chat" : bete = new Chat(nom);
            break;
            default : bete = null;
        }
        return bete;
    }
}
