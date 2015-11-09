/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.body.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import ma.insea.bibliotheque.body.presenter.AdminGestionLivrePresenter;

/**
 *
 * @author habib
 */
public class AdminGestionLivreView extends JPanel implements AdminGestionLivrePresenter.Display{

    
    final JComboBox<String> listCherches;
    final JTextField chercheField;
    final JTable tableLivres;
    final JButton newLivreButton;
    
    public AdminGestionLivreView() {
        String[] strings = {"ISBN","TITRE","Description"};
        listCherches = new JComboBox<>(strings);
        chercheField = new JTextField();
        chercheField.setOpaque(true);
        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/img/rechercher.png")));
        label.setOpaque(true);
        chercheField.add(label);
        chercheField.setPreferredSize(new Dimension(150, 25));
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(chercheField.getBorder());
        chercheField.setBorder(null);
        label.setBackground(chercheField.getBackground());
        panel.add(label,BorderLayout.WEST);
        panel.add(chercheField,BorderLayout.CENTER);
        tableLivres = new JTable();
        newLivreButton = new JButton("new Livre");
        setLayout(new BorderLayout(5,5));
        JPanel haut = new JPanel();
        JPanel west = new JPanel();
        west.add(listCherches);
        west.add(panel);
//        haut.add(listCherches,BorderLayout.WEST);
//        haut.add(panel,BorderLayout.CENTER);
        newLivreButton.setBackground(Color.GREEN);
        newLivreButton.setForeground(Color.GRAY);
        
        //
        haut.add(west);
        haut.add(newLivreButton);
        haut.setBackground(Color.WHITE);
        add(haut,BorderLayout.NORTH);
        add(new JScrollPane(tableLivres),BorderLayout.CENTER);
        tableLivres.setFillsViewportHeight(true);
       
    }

    @Override
    public JTable getTable() {
        return tableLivres;
    }

    @Override
    public JTextField getChercheField() {
        return chercheField;
    }

    @Override
    public String getMotChercher() {
        return chercheField.getText();
    }

    @Override
    public int getChoixRecherche() {
        return listCherches.getSelectedIndex();
    }

    @Override
    public JButton getNewLivreButton() {
        return newLivreButton;
    }


    class JTableButtonRenderer implements TableCellRenderer {        
        @Override 
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JButton button = (JButton)value;
            return button;  
        }
    }
    
    
    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public void setModel(TableModel model) {
       tableLivres.setModel(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tableLivres.setDefaultRenderer(String.class, centerRenderer);
        TableCellRenderer buttonRenderer = new JTableButtonRenderer();
        tableLivres.getColumnModel().getColumn(4).setCellRenderer(buttonRenderer);
        
    }

    
    
}
