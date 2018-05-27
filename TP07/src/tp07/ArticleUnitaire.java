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
<<<<<<< HEAD
abstract class ArticleUnitaire extends Article {
    
    private String marque;
    private double pu;
    private String descriptif;

    public ArticleUnitaire(String marque, double pu, String descriptif, String reference) {
        super(reference);
        this.marque = marque;
        this.pu = pu;
        this.descriptif = descriptif;
    }
   
    
  
    
   public String getDescriptif(){
       return this.descriptif;
   }
    
    public double getPU(){
        return this.pu;
    }
    
    public String getMarque(){
        return this.marque;
=======
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
>>>>>>> c0c0357d8f8286a3bf09ecec59034348f6ac6e38
    }
    
    @Override
    public String getDescriptif() {
        return descriptif;
    } 
      
   
      
   
}
