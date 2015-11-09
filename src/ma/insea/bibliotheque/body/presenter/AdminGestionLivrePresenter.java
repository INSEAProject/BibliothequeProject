/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.body.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import ma.insea.bibliotheque.dialog.presenter.AddLivreDialogPresenter;
import ma.insea.bibliotheque.dialog.presenter.AddLivreDialogView;
import ma.insea.bibliotheque.interfaces.BodyDisplay;
import ma.insea.bibliotheque.interfaces.BodyPresenter;
import ma.insea.bibliotheque.model.Livre;
import ma.insea.bibliotheque.util.TableLivreModel;

/**
 *
 * @author habib
 */
public class AdminGestionLivrePresenter implements BodyPresenter{

    public interface Display extends BodyDisplay{
        JPanel getPanel();
        void setModel(TableModel model);
        JTable getTable();
        JTextField getChercheField();
        String getMotChercher();
        int getChoixRecherche();
        JButton getNewLivreButton();
    }
    
    
    final Display display;
    final TableLivreModel livreModel;
    final String[] choix = {"ISBN","TITRE","Description"};
    
    public AdminGestionLivrePresenter(BodyDisplay display) {
        this.display = (Display) display;
        livreModel = new TableLivreModel();
        bind();
    }
    
    
    
    private void bind(){
        display.setModel(livreModel);
        display.getTable().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int row = display.getTable().getSelectedRow();
                int col = display.getTable().getSelectedColumn();
                if(col == 4){
                    supprimer(livreModel.getLivres().get(row));
                }
            }
        });
        display.getChercheField().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                String motChercher = display.getMotChercher();
                switch(display.getChoixRecherche()){
                    case 0 :
                        ArrayList<Livre> livres = new ArrayList<>();
                        livres.add(new Livre("ff", "ff", "fsf", null, "fsqf", null, null));
                        livreModel.setLivres(livres);
                        livreModel.fireTableDataChanged();
                }
            }
        });
        display.getNewLivreButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AddLivreDialogPresenter presenter = new AddLivreDialogPresenter(new AddLivreDialogView());
            }
        });
        
    }
    
    private void supprimer(Livre e){
        String[] options = {"yes","no"};
        int choix = JOptionPane.showOptionDialog(null, 
                "est ce que vous ête sûre de supprimer ce livre "+e.getTitre(),
                "supprission d'un livre",JOptionPane.OK_CANCEL_OPTION ,
                JOptionPane.QUESTION_MESSAGE ,null,options,options[1]);
        if(choix == 0){
            livreModel.supprimerLivre(e);
            livreModel.fireTableDataChanged();
        }
    }
    
    @Override
    public void go(JPanel body) {
        body.removeAll();
        body.add(display.getPanel());
        body.validate();
        body.repaint();
    }
    
}
