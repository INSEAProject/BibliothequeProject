/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque;

import javax.swing.SwingUtilities;
import ma.insea.bibliotheque.body.view.AdminGestionLivreView;
import ma.insea.bibliotheque.controller.BodyController;
import ma.insea.bibliotheque.controller.MenuLeftController;
import ma.insea.bibliotheque.frame.FrameView;
import ma.insea.bibliotheque.menuLeft.view.AdminView;

/**
 *
 * @author habib
 */
public class Bibliotheque {

    public static FrameView frame;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                frame = new FrameView();
                BodyController controller = new BodyController();
                controller.go(frame.getBody(),new AdminGestionLivreView());
                MenuLeftController menuLeftController = new MenuLeftController();
                menuLeftController.go(frame.getMenuLeft(),new AdminView());
            }
        });
    }
    
}
