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
public class Bibliothequaire {
    private String userName;
    private String password;

    public Bibliothequaire() {
    }

    public Bibliothequaire(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
    
    
}
