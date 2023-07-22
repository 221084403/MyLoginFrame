/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import za.ac.tut.ui.placeholder.*;

/**
 *
 * @author MNCEDISI
 */
public class LoginFrame extends JFrame
{
    private JPanel headingPNL;
    private JPanel spaceLabelPNL;
    private JPanel loginBtnPNL;
    private JPanel mainPNL;
    
    private JLabel headingLBL;
    private JLabel subHeadingLBL;
    private JLabel idNumLBL;
    private JLabel passwordLBL;
    
    private JButton loginBTN;
    
    private PlaceHolderTxtFLD placeHolderTxtField;
    private PlaceHolderPasswordFLD placeHolderTxtPassword;

    public LoginFrame() 
    {
        setTitle("Login Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350, 260);
        setResizable(false);
        
        headingPNL = new JPanel(new FlowLayout(FlowLayout.CENTER));
        spaceLabelPNL = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginBtnPNL = new JPanel(new FlowLayout(FlowLayout.CENTER));
        mainPNL = new JPanel(new GridLayout(3, WIDTH , WIDTH, 5));
        
        headingLBL = new JLabel("Welcome Back");
        headingLBL.setFont(new Font("Trade Gothic Next Heavy", Font.BOLD, 24));
        
        subHeadingLBL = new JLabel("Your journey starts here.");
        subHeadingLBL.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
        
        idNumLBL = new JLabel("ID Number");
        passwordLBL = new JLabel("Password");
        
        placeHolderTxtField = new PlaceHolderTxtFLD(idNumLBL.getText());
        placeHolderTxtField.setColumns(20);
        
        placeHolderTxtField.setBorder(BorderFactory.createEmptyBorder());
        placeHolderTxtField.setPreferredSize(new Dimension(WIDTH, 30));
       
        placeHolderTxtPassword = new PlaceHolderPasswordFLD(passwordLBL.getText());
        placeHolderTxtPassword.setColumns(20);
        placeHolderTxtPassword.setBorder(BorderFactory.createEmptyBorder());
        placeHolderTxtPassword.setPreferredSize(new Dimension(WIDTH,30));
        
        loginBTN = new JButton("Login");
        loginBTN.setBackground(Color.red);
        loginBTN.setForeground(Color.white);
        loginBTN.setFont(new Font("Trade Gothic Next Heavy", Font.BOLD, 14));
        loginBTN.setBorder(BorderFactory.createEmptyBorder());
        loginBTN.setPreferredSize(new Dimension(220, 30));
        loginBTN.addActionListener(new LoginButton());
        
        headingPNL.add(headingLBL , BorderLayout.NORTH);
        headingPNL.add(subHeadingLBL , BorderLayout.SOUTH);
        
        spaceLabelPNL.add(placeHolderTxtField , BorderLayout.NORTH);
        spaceLabelPNL.add(placeHolderTxtPassword , BorderLayout.SOUTH);
        
        loginBtnPNL.add(loginBTN);
        
        mainPNL.add(headingPNL);
        mainPNL.add(spaceLabelPNL);
        mainPNL.add(loginBtnPNL);
        
        add(mainPNL , BorderLayout.CENTER);
     
        setVisible(true);    
    }    

    private static class LoginButton implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String output = "Successfully Login";
            JOptionPane.showMessageDialog(null, output, "Login", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
