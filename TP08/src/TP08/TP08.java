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
        SPA Dijon = new SPA("Dijon");
        Bestioles bestioles = new Bestioles();
        bestioles.ajouteAnimal("Felix", "Vautour");
        System.out.println(bestioles);
        
        
    }
    
}
