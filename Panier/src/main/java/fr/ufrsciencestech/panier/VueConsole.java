/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rl109350
 */
public class VueConsole implements Observer{
    private String trace;
    
    public VueConsole()
    {
        trace = "Valeur initiale = " + 0;
        System.out.println(trace);
    }
    
    // accesseurs et mutateurs
    
    public String getTrace()
    {
        return this.trace;
    }
    
    public void setTrace(String trace)
    {
        this.trace = trace;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        trace = "Nouvelle valeur " + ((Integer)arg).toString();
        System.out.println(trace);
    }
}
