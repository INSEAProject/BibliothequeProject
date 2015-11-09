/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.menuLeft.presenter;

import javax.swing.JButton;
import javax.swing.JPanel;
import ma.insea.bibliotheque.interfaces.MenuLeftDisplay;
import ma.insea.bibliotheque.interfaces.MenuLeftPresenter;

/**
 *
 * @author habib
 */
public class AdminPresenter implements MenuLeftPresenter{

    public interface Display extends MenuLeftDisplay{
        JPanel getPanel();
        
        JButton getLivreButton();

        JButton getAuthorButton();

        JButton getAdherentButton();

        JButton getExemplaireButton();

        JButton getPretButton();

        JButton getUtilisateurButton();
    }
    
    final Display display;

    public AdminPresenter(MenuLeftDisplay display) {
        this.display = (Display) display;
        bind();
    }
    
    private void bind(){
        
    }
    
    @Override
    public void go(JPanel menuLeft) {
        menuLeft.removeAll();
        menuLeft.add(display.getPanel());
        menuLeft.revalidate();
        menuLeft.repaint();
    }
    
}
