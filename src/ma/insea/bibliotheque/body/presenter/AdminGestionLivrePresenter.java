/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.presenter.body;

import javax.swing.JPanel;
import ma.insea.bibliotheque.interfaces.BodyDisplay;
import ma.insea.bibliotheque.interfaces.BodyPresenter;
import ma.insea.bibliotheque.model.Bibliothequaire;

/**
 *
 * @author habib
 */
public class IndexPresenter implements BodyPresenter{

    public interface Display extends BodyDisplay{
        JPanel getPanel();
        void setNomUser(String nomUser);
    }
    
    Bibliothequaire bibliothequaire;
    
    final Display display;

    public IndexPresenter(BodyDisplay display,Bibliothequaire bibliothequaire) {
        this.bibliothequaire = bibliothequaire;
        this.display = (Display) display;
        bind();
    }
    
    
    private void bind(){
        display.setNomUser(bibliothequaire.getUserName());
    }
    
    @Override
    public void go(JPanel body) {
        body.removeAll();
        body.add(display.getPanel());
        body.validate();
        body.repaint();
    }
    
}
