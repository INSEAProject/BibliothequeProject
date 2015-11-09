/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.dialog.presenter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ma.insea.bibliotheque.model.Livre;
import static ma.insea.bibliotheque.Bibliotheque.frame;

/**
 *
 * @author habib
 */
public class AddLivreDialogView extends JDialog implements AddLivreDialogPresenter.Display{

    final JTextField ISBNField;
    final JLabel errorISBN;
    final JTextField TitreField;
    final JLabel errorTitre;
    final JTextArea discrArea;
    final JLabel errorDiscr;
    final JButton saveButton;
    final JButton cancelButton;
    
    public AddLivreDialogView() {
        super(frame);
        setLocationRelativeTo(frame);
        setTitle("Ajouter nouveau livre");
        JPanel content = new JPanel();
        add(content,BorderLayout.CENTER);
        //
        setSize(650, 400);
        JPanel panel = new JPanel(new GridLayout(4, 3, 10,10));
        panel.setPreferredSize(new Dimension(600, 150));
        JLabel label = new JLabel("ISBN");
        JLabel label1 = new JLabel("Titre");
        JLabel label2 = new JLabel("Discription");
        ISBNField = new JTextField();
        TitreField = new JTextField();
        discrArea = new JTextArea(4, 20);
        saveButton = new JButton("Ajouter");
        cancelButton = new JButton("Annuler");
        errorISBN = new JLabel("ISBN doit être 13 charctére");
        errorTitre = new JLabel("titre doit être de 2 à 40 caractére");
        errorDiscr = new JLabel("discription doit être de 5 à 200 charctére");
        errorDiscr.setVisible(false);
        errorDiscr.setForeground(Color.red);
        errorISBN.setVisible(false);
        errorISBN.setForeground(Color.red);
        errorTitre.setVisible(false);
        errorTitre.setForeground(Color.red);
        panel.add(label);
        panel.add(ISBNField);
        panel.add(errorISBN);
        panel.add(label1);
        panel.add(TitreField);
        panel.add(errorTitre);
        panel.add(label2);
        panel.add(discrArea);
        panel.add(errorDiscr);
        panel.add(saveButton);
        panel.add(cancelButton);
        content.add(panel);
        setVisible(true);
    }

    
    @Override
    public JDialog getDialog() {
        return this;
    }

    @Override
    public Livre getLivre() {
        return new Livre();
    }
    
}
