/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.model;

/**
 *
 * @author habib
 */
public class Exemplaire {
    
    private Livre livre;
    
    private String codeExemplaire;

    public Exemplaire() {
    }
    
    public Exemplaire(Livre livre,String codeExemplaire) {
        this.livre = livre;
        this.codeExemplaire = codeExemplaire;
    }

    

    public void setCodeExemplaire(String codeExemplaire) {
        this.codeExemplaire = codeExemplaire;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public String getCodeExemplaire() {
        return codeExemplaire;
    }

    public Livre getLivre() {
        return livre;
    }

    
}
