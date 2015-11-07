/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.presenter.body;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import ma.insea.bibliotheque.controller.BodyController;
import ma.insea.bibliotheque.interfaces.BodyDisplay;
import ma.insea.bibliotheque.interfaces.BodyPresenter;
import ma.insea.bibliotheque.model.Bibliothequaire;
import ma.insea.bibliotheque.view.body.IndexView;

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
    BodyController controller;

    public SeConnecterPresenter(BodyDisplay display,BodyController controller) {
        this.controller = controller;
        this.display = (Display) display;
        bind();
    }
    
    private void bind(){
        display.getSeConnectButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.goIndex(new IndexView(), display.getBibiothequaire());
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
        body.removeAll();
        body.add(display.getPanel());
        body.validate();
        body.repaint();
    }
    
}
