/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06;

/**
 *
 * @author Beelzed
 */
public class TP06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aeroport roissy = new Aeroport();
        AvionCivil boeing = new AvionCivil("Boeing");
        AvionCargo titan = new AvionCargo("Titan");
        AvionMilitaire lockheed = new AvionMilitaire("Lockheed");
        Chasse xwing = new Chasse("X-Wing");
        System.out.println(xwing);
        Ravitailleur jaipasdenom = new Ravitailleur("JaiPasDeNom");
        System.out.println(jaipasdenom);
        roissy.ajouteAvionCargo(titan);
        roissy.ajouteAvionCiv(boeing);
        roissy.ajouteAvionMil(lockheed);
        System.out.println(boeing);
        System.out.println(titan);
        System.out.println(lockheed);
        System.out.println(roissy);
        boeing.Decolle();
        titan.addCargaison("Livres");
        titan.addCargaison("Jeux");
        titan.Decolle();
        lockheed.Decolle();
        System.out.println(roissy);
        
    }
    
}
