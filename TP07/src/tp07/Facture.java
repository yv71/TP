/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.util.ArrayList;

/**
 *
 * @author yv066840
 */
public class Facture {
    private java.util.ArrayList<Article> liste;
    private String nom;
    private String prenom;

    public Facture(String nom, String prenom) {
        this.liste = new ArrayList<Article>();
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public void addArticle(Article a){
        liste.add(a);
    }
    
    public void removeArticle (Article a){
        if (liste.contains(a)){
            liste.remove(a);
        }
        else {
            System.out.println("Article non présent dans le panier !");
        }
    }
    
    public String toString(){
        double total = 0;
        for (Article a : liste){
            System.out.println(a);
            total += a.getPU();
        }
        return "Commande de " + nom + " "+ prenom + " total du panier : " + total + " €";        
    }
    
    
    
}
