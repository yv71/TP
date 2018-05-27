/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

/**
 *
<<<<<<< HEAD
 * @author Beelzed
 */
public class Lot extends Article{
    
=======
 * @author yv066840
 */
public class Lot extends Article{

>>>>>>> c0c0357d8f8286a3bf09ecec59034348f6ac6e38
    private Article article;
    private int nb;
    private int pourcentage;

<<<<<<< HEAD
    public Lot(String reference) {
        super(reference);
    }


    String getDescriptif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    double getPU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String getMarque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
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
>>>>>>> c0c0357d8f8286a3bf09ecec59034348f6ac6e38
    }
    
}
