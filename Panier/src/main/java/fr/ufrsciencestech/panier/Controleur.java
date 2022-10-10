/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rl109350
 */

public class Controleur implements ActionListener{
    private Panier p;
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(((Component)e.getSource()).getName().equals("Plus"))
            try{
                p.ajout(new Orange());
            }catch(PanierPleinException exception){}         
        else
            try{
                p.retrait();
            }catch(PanierVideException exception){}
    }
    
    public Panier getPanier()
    {
        return this.p;
    }
    
    public void setPanier(Panier p)
    {
        this.p = p;
    }
    
}
