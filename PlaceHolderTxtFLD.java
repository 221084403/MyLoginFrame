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
public class PlaceHolderTxtFLD extends JTextField implements FocusListener
{
    private String placeholder;
    private boolean showingPlaceHolder;

    public PlaceHolderTxtFLD(String placeholder) 
    {
        this.placeholder = placeholder;
        this.showingPlaceHolder = true;
        
        setForeground(Color.GRAY);
        setText(placeholder);
        
        addFocusListener(this);
    }
    
    @Override
    public void focusGained(FocusEvent e)
    {
        if(showingPlaceHolder)
        {
            setText("");
            setForeground(Color.BLACK);
            showingPlaceHolder = false;
        }
    }

    @Override
    public void focusLost(FocusEvent e) 
    {
        if(getText().isEmpty())
        {
            setText(placeholder);
            setForeground(Color.gray);
            showingPlaceHolder = true;
        }
    }
    
}
