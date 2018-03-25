package foreveryoung;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class LoginInterface {

    //constructor
    public LoginInterface(){
    this.init();
    }
    
    //initialises components
    public void init(){
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout(5,5)); 
        JPanel LabelPanel = new JPanel(new GridLayout(0,1,2,2));
        JPanel TextFieldPanel = new JPanel(new GridLayout(0,1,2,2));
        
        JTextField userNameTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JLabel uLabel = new JLabel("Username:", SwingConstants.RIGHT);
        JLabel pLabel = new JLabel("Password:", SwingConstants.RIGHT);
        
        LabelPanel.add(uLabel);
        LabelPanel.add(pLabel);
        
        TextFieldPanel.add(userNameTextField);
        TextFieldPanel.add(passwordField);
        
        panel.add(TextFieldPanel, BorderLayout.CENTER);
        panel.add(LabelPanel, BorderLayout.WEST);
        frame.add(panel);
        
        JOptionPane.showConfirmDialog(frame, panel, "login", JOptionPane.OK_CANCEL_OPTION);
    }
}
