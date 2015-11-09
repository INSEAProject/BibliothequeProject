/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.controller;

import javax.swing.JPanel;
import ma.insea.bibliotheque.body.presenter.AdminGestionLivrePresenter;
import ma.insea.bibliotheque.interfaces.BodyDisplay;
import ma.insea.bibliotheque.interfaces.BodyPresenter;
import ma.insea.bibliotheque.body.presenter.SeConnecterPresenter;

/**
 *
 * @author habib
 */
public class BodyController implements ma.insea.bibliotheque.interfaces.BodyController{

    public BodyController() {
    }

    

    @Override
    public void go(JPanel body, BodyDisplay display) {
        BodyPresenter presenter = null;
        if(display instanceof SeConnecterPresenter.Display){
            presenter = new SeConnecterPresenter(display);
        }else if(display instanceof AdminGestionLivrePresenter.Display){
            presenter = new AdminGestionLivrePresenter(display);
        }
         
        presenter.go(body); 
    }
    
}
