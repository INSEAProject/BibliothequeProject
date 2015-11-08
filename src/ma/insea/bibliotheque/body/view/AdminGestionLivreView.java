/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.view.body;

import javax.swing.JLabel;
import javax.swing.JPanel;
import ma.insea.bibliotheque.presenter.body.IndexPresenter;

/**
 *
 * @author habib
 */
public class IndexView extends JPanel implements IndexPresenter.Display{

    final JLabel labelNom;
    
    public IndexView() {
        labelNom = new JLabel();
        add(labelNom);
    }

    
    
    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public void setNomUser(String nomUser) {
        labelNom.setText(nomUser);
    }
    
}
