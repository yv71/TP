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
public class Vautour extends Oiseau{

    public Vautour(String nom) {
        super(nom);
    }
    public String donneNourriture(){
        return "Carcasses";
    }
    
    public String donneEspece(){
        return "Vautour";
    }
}
