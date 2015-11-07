/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author habib
 */
public class Livre {
    
    private String isbn;
    private String titre;
    private String editeur;
    private Date dateedition;
    private String description;
    ArrayList<Auteur> auteurs = new ArrayList<>();
    ArrayList<Categorie> categories =  new ArrayList<>();
    
    public Livre() {
    }
    
    public Livre(String isbn,String titre,String editeur,Date dateedition,String description,ArrayList<Auteur>auteur,ArrayList<Categorie>categorie){
        this.isbn=isbn;
        this.titre=titre;
        this.editeur=editeur;
        this.dateedition=dateedition;
        this.description=description;
        this.auteurs=auteur;
        this.categories=categorie;
    }

    public void addAuteur(Auteur a){
        this.auteurs.add(a);
    }
    
    public void removeAuteur(Auteur a){
        this.auteurs.remove(a);
    }
    
    public void addCategorie(Categorie a){
        this.categories.add(a);
    }
    
    public void supprimerCategorie(Categorie a){
        this.categories.remove(a);
    }
    
    public void setAuteurs(ArrayList<Auteur> auteur) {
        this.auteurs = auteur;
    }

    public void setCategories(ArrayList<Categorie> categorie) {
        this.categories = categorie;
    }

    public void setDateedition(Date dateedition) {
        this.dateedition = dateedition;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList<Auteur> getAuteur() {
        return auteurs;
    }

    public ArrayList<Categorie> getCategorie() {
        return categories;
    }

    public Date getDateedition() {
        return dateedition;
    }

    public String getDescription() {
        return description;
    }

    public String getEditeur() {
        return editeur;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }
    
  
    
}
