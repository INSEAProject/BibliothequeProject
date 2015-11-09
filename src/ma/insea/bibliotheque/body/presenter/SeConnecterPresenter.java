/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.body.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import ma.insea.bibliotheque.interfaces.BodyDisplay;
import ma.insea.bibliotheque.interfaces.BodyPresenter;
import ma.insea.bibliotheque.model.Bibliothequaire;

/**
 *
 * @author habib
 */
public class SeConnecterPresenter implements BodyPresenter{

    public interface Display extends BodyDisplay{
        JPanel getPanel();
        JButton getSeConnectButton();
        JButton getClearButton();
        Bibliothequaire getBibiothequaire();
        void clearData();
    }
    
    final Display display;
    JPanel body;

    public SeConnecterPresenter(BodyDisplay display) {
        this.display = (Display) display;
        bind();
    }
    
    private void bind(){
        display.getSeConnectButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                BodyPresenter presenter = new IndexPresenter(new IndexView(),display.getBibiothequaire()) ;
//                presenter.go(body);
            }
        });
        display.getClearButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                display.clearData();
            }
        });
        
    }
    
    @Override
    public void go(JPanel body) {
        this.body = body;
        body.removeAll();
        body.add(display.getPanel());
        body.validate();
        body.repaint();
    }
    
}
