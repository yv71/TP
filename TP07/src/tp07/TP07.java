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
        Facture Oskour = new Facture("jean", "aimarre");
        Stylo Rouge1 = new Stylo("Bic", 0.20,"Stylo rouge", "ALED");
        Stylo Rouge2 = new Stylo("Bic", 0.20,"Stylo rouge", "ALED");
        Lot stBleus = new Lot(new Stylo("Bic", 0.20, "Stylo bleu", "help"),10,10,"bipbip");
        Oskour.addArticle(Rouge1);
        Oskour.addArticle(Rouge2);
        Oskour.addArticle(stBleus);
        System.out.println(Oskour);
    }
    
}
