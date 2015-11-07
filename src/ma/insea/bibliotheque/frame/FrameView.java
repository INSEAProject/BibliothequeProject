/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import ma.insea.bibliotheque.DataBase;

/**
 *
 * @author habib
 */
public class FrameView extends JFrame{
    
    public  static int WIDTH = 600;
    public  static int HEIGHT = 600;
    
    final JMenuBar menuBar;
    final JPanel body;
    
    public FrameView()  {
        setTitle("Bibliotheque");
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        body = new JPanel();
        body.setBackground(Color.white);
        add(body, BorderLayout.CENTER);
        buildFrame();
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowOpened(WindowEvent e) {
                try {
                    DataBase.connection();
                } catch (ClassNotFoundException | SQLException ex) {
                }
            }

            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    DataBase.disconnection();
                } catch (SQLException ex) {
                }
            }            
        });
    }
    
    private void buildFrame(){
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public JFrame getConteneur() {
        return this;
    }

    public JMenuBar getMenu() {
        return menuBar;
    }

    public JPanel getBody() {
        return body;
    }

    
}
