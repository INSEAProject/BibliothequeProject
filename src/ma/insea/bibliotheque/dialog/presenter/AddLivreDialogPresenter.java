/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.dialog.presenter;

import javax.swing.JDialog;
import ma.insea.bibliotheque.model.Livre;

/**
 *
 * @author habib
 */
public class AddLivreDialogPresenter {

    public interface Display{
        JDialog getDialog();
        Livre getLivre();
        
    }
    
    final Display display;
    final Livre livre;
    
    public AddLivreDialogPresenter(Display display) {
        this.display = display;
        livre = new Livre();
        bind();
    }
    
    private void bind(){
       
    }
    
}
