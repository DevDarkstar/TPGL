/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author richa
 */
public interface VueGraphique extends Observer{
    @Override
    public void update(Observable m, Object o);
    public void ajouteControleur(Controleur c);
}
