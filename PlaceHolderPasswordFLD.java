/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui.placeholder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author MNCEDISI
 */
public class PlaceHolderPasswordFLD extends JPasswordField implements FocusListener
{
    private String placeholder;
    private boolean showingPlaceHolder;

    public PlaceHolderPasswordFLD(String placeholder) 
    {
        this.placeholder = placeholder;
        this.showingPlaceHolder = true;
        
        setEchoChar((char)0);
        setForeground(Color.gray);
        setText(placeholder);
        
        addFocusListener(this);
        
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        if(showingPlaceHolder)
        {
            setText("");
            setEchoChar('*');
            setForeground(Color.black);
            showingPlaceHolder = false;
        }
    }

    @Override
    public void focusLost(FocusEvent e) 
    {
        if(getPassword().length ==0)
        {
            setText(placeholder);
            setEchoChar((char)0);
            setForeground(Color.gray);
            showingPlaceHolder = true;
        }
    }
    
}
