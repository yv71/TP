/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

/**
 *
 * @author yv066840
 */
public class Lot extends Article{

    private Article article;
    private int nb;
    private int pourcentage;

    public Lot(Article article, int nb, int pourcentage, String reference) {
        super(reference);
        this.article = article;
        this.nb = nb;
        this.pourcentage = pourcentage;
    }
    
    /**
     * 
     * @return le prix du lot(la remise ayant été effectuée)
     */
    public double getPU() {
        double total = nb*article.getPU();
        double remise = total * pourcentage / 100;
       return (total-remise);
    }

/**
 * 
 * @return la marque de l'article du lot
 */
    public String getMarque() {
        return article.getMarque();
    }
    
    public String toString(){
        return "Lot de " + nb + " " + article.getDescriptif() + " " + article.getPU() + " €, total avec remise de " + pourcentage + " % : " + this.getPU() + " €";
    }
/**
 * 
 * @return le descriptif de l'article du lot
 */
    String getDescriptif() {
        return article.getDescriptif();
    }
    
}
