/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author yv066840
 */

abstract class Animal implements java.io.Serializable {
    protected String nom;
    
    public Animal(String nom){
        this.nom = nom;
    }
    public static int save() throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream("essai.dat");
        ObjectOutputStream os = new ObjectOutputStream(file);
        os.writeObject(this);
        return 0;
    }
    protected String donneNom(){
        return this.nom;
    }
    
    abstract String donneEspece();
    
    abstract String donneNourriture();

    abstract String donneCri();
    
    public String toString(){
        return this.donneCri()+" ! Je m'appelle " + this.donneNom()+ ", je suis un " + this.donneEspece()+ "\nJe mange principalement : "+ this.donneNourriture() + ".\n";
    }
    
    
}
