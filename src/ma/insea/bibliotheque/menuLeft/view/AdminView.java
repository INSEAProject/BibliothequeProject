/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.menuLeft.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import ma.insea.bibliotheque.menuLeft.presenter.AdminPresenter;

/**
 *
 * @author habib
 */
public class AdminView extends JPanel implements AdminPresenter.Display{

    final JButton livreButton;
    final JButton authorButton;
    final JButton adherentButton;
    final JButton exemplaireButton;
    final JButton pretButton;
    final JButton utilisateurButton;
    
    public AdminView() {
        livreButton = new JButton("Livre");
        authorButton = new JButton("Author");
        adherentButton = new JButton("Adhérent");
        exemplaireButton = new JButton("Exemplaire");
        pretButton = new JButton("Prêt");
        utilisateurButton = new JButton("Utilisateur");
        setLayout(new GridLayout(6, 1, 0, 10));
        add(livreButton);
        add(authorButton);
        add(adherentButton);
        add(exemplaireButton);
        add(pretButton);
        add(utilisateurButton);
        setBackground(Color.GRAY);
    }

    
    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public JButton getLivreButton() {
        return livreButton;
    }

    @Override
    public JButton getAuthorButton() {
        return authorButton;
    }

    @Override
    public JButton getAdherentButton() {
        return adherentButton;
    }

    @Override
    public JButton getExemplaireButton() {
        return exemplaireButton;
    }

    @Override
    public JButton getPretButton() {
        return pretButton;
    }

    @Override
    public JButton getUtilisateurButton() {
        return utilisateurButton;
    }
    
    
}
