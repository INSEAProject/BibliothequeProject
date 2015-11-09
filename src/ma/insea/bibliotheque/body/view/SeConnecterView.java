/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.view.body;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import ma.insea.bibliotheque.model.Bibliothequaire;
import ma.insea.bibliotheque.presenter.body.SeConnecterPresenter;

/**
 *
 * @author habib
 */
public class SeConnecterView extends JPanel implements SeConnecterPresenter.Display{

    
    final JButton buttonSeConnecter;
    final JButton buttonClear;
    final JTextField userNameField;
    final JPasswordField passwordField;
    
    public SeConnecterView() {
        super(new GridLayout(3, 2,10,10));
        setBackground(Color.GRAY);
        buttonClear = new JButton("Clear");
        buttonSeConnecter = new JButton("Se Connecter");
        userNameField = new JTextField();
        passwordField =  new JPasswordField();
        JLabel labelName = new JLabel("Nom :");
        JLabel labelPassword = new JLabel("Password :");
        add(labelName);
        add(userNameField);
        add(labelPassword);
        add(passwordField);
        add(buttonClear);
        add(buttonSeConnecter);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    
    
    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public JButton getSeConnectButton() {
        return buttonSeConnecter;
    }

    @Override
    public JButton getClearButton() {
        return buttonClear;
    }

    @Override
    public Bibliothequaire getBibiothequaire() {
        return new Bibliothequaire(userNameField.getText(),String.valueOf(passwordField.getPassword()));
    }

    @Override
    public void clearData() {
        userNameField.setText("");
        passwordField.setText("");
    }

    
}
