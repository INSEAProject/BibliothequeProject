/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.controller;

import javax.swing.JPanel;
import ma.insea.bibliotheque.interfaces.BodyDisplay;
import ma.insea.bibliotheque.interfaces.BodyPresenter;
import ma.insea.bibliotheque.model.Bibliothequaire;
import ma.insea.bibliotheque.presenter.body.IndexPresenter;
import ma.insea.bibliotheque.presenter.body.SeConnecterPresenter;

/**
 *
 * @author habib
 */
public class BodyController implements ma.insea.bibliotheque.interfaces.BodyController{

    JPanel body;
    
    public BodyController() {
    }

    public void goIndex(BodyDisplay display,Bibliothequaire bibliothequaire){
        BodyPresenter presenter = new IndexPresenter(display, bibliothequaire);
        presenter.go(body);
    }

    @Override
    public void go(JPanel body, BodyDisplay display) {
        this.body = body;
        BodyPresenter presenter = null;
        if(display instanceof SeConnecterPresenter.Display){
            presenter = new SeConnecterPresenter(display,this);
        }
         
        presenter.go(body); 
    }
    
}
