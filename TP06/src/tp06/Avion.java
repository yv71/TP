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


public class Avion {
    private double altitude;
    private double vitesse;
    private String nom;
    private boolean enVol;
    /**
     * constructeur de la classe
     * @param nom = nom de l'avion
     */
    public Avion(String nom){
        this.nom = nom;
        this.vitesse = 0;
        this.altitude = 0;
        this.enVol = false;
    }
    /**
     * methode faisant atterir l'avion
     */
    public void Atteri(){
        this.vitesse = 0;
        this.altitude = 0;
        this.enVol = false;
    }
    
    /**
     * methode faisant décoller l'avion
     */
    public void Decolle() {
        this.vitesse = 150;
        this.altitude = 1500;
        this.enVol = true;
    }
    
    /**
     * 
     * @return nom de l'avion
     */
    public String getNom(){
        return this.nom;
}
    /**
     * 
     * @return vitesse de l'avion
     */
    public double getVitesse(){
        return this.vitesse;
}
    /**
     * 
     * @return altitude de l'avion
     */
    public double getAltitude(){
        return this.altitude;
}    
    /**
     * 
     * @return toutes les informations de l'avion
     */
    public String toString(){
        String enVol;
        if (this.enVol){
            enVol = "En vol";
        }
        else {
            enVol = "Au sol";
        }
        return "Avion : " + this.getNom() + " Etat : " + enVol + " Vitesse : " + this.getVitesse() + " Altitude : "+ this.getAltitude();
    }
}
