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
    
    abstract String getDescriptif();
    
    abstract double getPU();
    
    abstract String getMarque();
    
    public String toString(){
        return "Reference : " + reference + " Descriptif : " + this.getDescriptif()+ " Prix Unitaire : " + this.getPU() + " Marque : " + this.getMarque();
    }
    
}
