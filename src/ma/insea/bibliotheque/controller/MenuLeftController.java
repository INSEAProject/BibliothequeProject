/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.controller;

import javax.swing.JPanel;
import ma.insea.bibliotheque.interfaces.MenuLeftDisplay;
import ma.insea.bibliotheque.interfaces.MenuLeftPresenter;
import ma.insea.bibliotheque.menuLeft.presenter.AdminPresenter;

/**
 *
 * @author habib
 */
public class MenuLeftController implements ma.insea.bibliotheque.interfaces.MenuLeftController{
    
    @Override
    public void go(JPanel menuLeft, MenuLeftDisplay display) {
        MenuLeftPresenter presenter = null;
        if(display instanceof AdminPresenter.Display){
            presenter = new AdminPresenter(display);
        }
        presenter.go(menuLeft);
    }
    
}
