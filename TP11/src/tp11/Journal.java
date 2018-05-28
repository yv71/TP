/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
/**
 *
 * @author yv066840
 */
public class Journal {
    private static Journal instance = null;
    private String nomFichier;
    private FileOutputStream file;

    
    private Journal(String nom) throws IOException{
        this.nomFichier = nom;
        System.out.println("test");
        file = new FileOutputStream(nomFichier+".dat");
        this.log("Entree");
    }
    
    public static Journal get(String nom) throws IOException{
        if (instance ==null){
            Journal.instance = new Journal(nom);
        }
        return Journal.instance;
    }
    
    public void efface() throws IOException{
        file.close();
        file = new FileOutputStream(nomFichier+".txt");
        this.log("Entree");
    }
    
    public void log(String msg) throws IOException{
        Date d = new Date();
        String m = d.dateCourte()+ " " + msg + "\n";
        byte[] test = m.getBytes();
        file.write(test);
        file.flush();
        
    }
}
