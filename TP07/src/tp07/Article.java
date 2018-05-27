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
abstract class Article {

    private String reference;

    public Article(String reference) {
        this.reference = reference;
    }
    /**
     * 
     * @return le descriptif de l'article
     */
    abstract String getDescriptif();
    
    /**
     * 
     * @return le prix unitaire de l'article
     */
    abstract double getPU();
    
    /**
     * 
     * @return la marque de l'article
     */
    abstract String getMarque();
    
    /**
     * 
     * @return la reference de l'article
     */
    public String getReference(){
        return this.reference;
    }
    
    
    public String toString(){
        return "1 " + this.getDescriptif() + " " + this.getMarque() + " " + this.getPU() + " € " + "Reference : " + this.getReference();
    }
    
}
