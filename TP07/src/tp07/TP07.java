/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

/**
 *
 * @author Beelzed
 */
public class TP07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facture Oskour = new Facture("McFly", "Marty");
        Stylo Rouge1 = new Stylo("Bic", 0.20,"Stylo rouge", "IKJTG");
        Stylo Rouge2 = new Stylo("Bic", 0.20,"Stylo rouge", "IKJTG");
        Lot lotBleus = new Lot(new Stylo("Bic", 0.20, "Stylo bleu", "help"),10,10,"BBFHN");
        Ramette ram = new Ramette("Clairefontaine", 2.50, "ramette de papier", "IIDJS");
        Lot lotRam = new Lot(new Ramette("Clairefontaine", 2.50, "ramette de papier", "IIDJS"), 5 , 5, "IKHKD");
        Oskour.addArticle(Rouge1);
        Oskour.addArticle(Rouge2);
        Oskour.addArticle(lotBleus);
        Oskour.addArticle(ram);
        Oskour.addArticle(lotRam);
        System.out.println(Oskour);
    }
    
}
