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
public class TP08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bestioles bestioles = new Bestioles();
        bestioles.ajouteAnimal("Felix", "Chat");
        System.out.println(bestioles);
        System.out.println(bestioles.nbAnimaux());
        System.out.println(bestioles.animalPresent(new Chat("Felix")));
        
        
    }
    
}
