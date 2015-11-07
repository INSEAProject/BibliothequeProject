/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.model;

import java.util.ArrayList;

/**
 *
 * @author habib
 */
public class Categorie {
    
    private String nom;
    private ArrayList<Categorie> sousCategories  = new ArrayList<>();

    public Categorie(String nom) {
        this.nom = nom;
    }

    public Categorie() {
    }
    
    public Categorie(String nom,ArrayList<Categorie> sousCategories){
        this(nom);
        this.sousCategories = sousCategories;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSousCategories(ArrayList<Categorie> sousCategories) {
        this.sousCategories = sousCategories;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Categorie> getSousCategories() {
        return sousCategories;
    }
    
    public void addSousCategorie(Categorie categorie){
        this.sousCategories.add(categorie);
    }
    
    public void removeSousCategorie(Categorie categorie){
        this.sousCategories.remove(categorie);
    }
}
