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
abstract class ArticleUnitaire extends Article{


        private String marque;
        private double pu;
        private String descriptif;
    
      public ArticleUnitaire(String marque, double pu, String descriptif, String reference) {
         super(reference);
          this.marque = marque;
          this.pu = pu;
          this.descriptif = descriptif;
      }
      
    @Override
    public String getMarque() {
        return marque;
    }

    @Override
    public double getPU() {
        return pu;
    }
    
    @Override
    public String getDescriptif() {
        return descriptif;
    } 
      
   
      
   
}
