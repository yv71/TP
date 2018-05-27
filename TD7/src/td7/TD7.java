/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td7;

/**
 *
 * @author yv066840
 */
public class TD7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SPA Dijon = new SPA("Dijon");
        
        Animal Corentin = new Humain ("Corentin");
        Dijon.Trouve(Corentin);
        Animal Elie = new Humain ("Elie");
        Dijon.Trouve(Elie);
        System.out.println(Dijon);
        Animal Jerome = new Humain("Jérôme");
        System.out.println(Jerome);
        
        Animal Churchill = new Cocker("Churchill");
        System.out.println(Churchill);
        
        Animal Jack = new Berger("Jack");
        System.out.println(Jack);
        
        Animal Jason = new Aigle("Jason");
        System.out.println(Jason);
        
        Animal Flaps = new Vautour ("Flaps ");
        System.out.println(Flaps );
        
        Animal Felix = new Chat ("Felix");
        System.out.println(Felix);
    }
    
}
