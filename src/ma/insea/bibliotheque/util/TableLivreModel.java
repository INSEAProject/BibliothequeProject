/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.util;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;
import ma.insea.bibliotheque.body.presenter.AdminGestionLivrePresenter;
import ma.insea.bibliotheque.model.Livre;

/**
 *
 * @author habib
 */
public class TableLivreModel extends AbstractTableModel{

    private String[] columns = {"ISBN","Titre","Description","date","remove"};
    private ArrayList<Livre> livres = new ArrayList<>();

    public void supprimerLivre(Livre e){
        livres.remove(e);
    }
    
    public TableLivreModel() {
        livres.add(new Livre("dqsd", "sqd", "sqf", new Date(), "sq",null , null));
        livres.add(new Livre("dqsddddd", "ddsqd", "sqf", new Date(), "sq",null , null));
        
    }
    
    
    
    @Override
    public int getRowCount() {
        return livres.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 4 :
                return JButton.class;
            default:
                return String.class;
        }
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livre livre = livres.get(rowIndex);
        switch (columnIndex){
            case 0 : 
                return livre.getIsbn();
            case 1:
                return livre.getTitre();
            case 2:
                return livre.getDescription();
            case 3:
                return livre.getDateedition();
            case 4:
               final JButton button = new JButton("Remove");
                return button;
        }
        return null;
    }    
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void setLivres(ArrayList<Livre> livres) {
        this.livres = livres;
    }
    
    
}
