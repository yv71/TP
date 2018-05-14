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
    /**
     * methode permettant l'ajout d'un article au panier
     * @param a article à ajouter au panier
     */
    public void addArticle(Article a){
        liste.add(a);
    }
    
    /**
     * méthode permettant de retirer un article du panier (s'il est présent)
     * @param a article à retirer du panier
     */
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
        return "Commande de " + prenom + " "+ nom + " total du panier : " + total + " €";        
    }
    
    
    
}
