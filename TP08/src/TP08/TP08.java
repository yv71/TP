/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author yv066840
 */
public class TP08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, IOException, IOException, ClassNotFoundException {
        // TODO code application logic here
        Bestioles bestioles = new Bestioles();
        bestioles.ajouteAnimal("Felix", "Chat");
        System.out.println(bestioles);
        System.out.println(bestioles.nbAnimaux());
        System.out.println(bestioles.animalPresent(new Chat("Felix")));
        FileOutputStream file = new FileOutputStream("essai.dat");
        ObjectOutputStream os = new ObjectOutputStream(file);
        
        os.writeObject(bestioles);
        os.flush();
        os.close(); 
        
        FileInputStream file2 = new FileInputStream("essai.dat");
        ObjectInputStream os2 = new ObjectInputStream(file2);
        Bestioles b = (Bestioles) os2.readObject();
        System.out.println(b);
    }
    
}
