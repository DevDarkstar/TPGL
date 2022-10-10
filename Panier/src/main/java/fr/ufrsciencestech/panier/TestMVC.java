/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author rl109350
 */
public class TestMVC {
    
    private Panier p;
    private VueGSwing vueGSwing;
    private VueConsole vueConsole;
    private Controleur controleur;
    
    public TestMVC()
    {
        p = new Panier(10);
        vueGSwing = new VueGSwing();
        vueConsole = new VueConsole();
        controleur = new Controleur();
        
        controleur.setPanier(p);    //setModele
        p.addObserver(vueGSwing);
        p.addObserver(vueConsole);
        vueGSwing.ajouteControleur(controleur);
    }
    
    public VueGSwing getVueGSwing()
    {
        return this.vueGSwing;
    }
    
    public void setVueGSwing(VueGSwing vueGSwing)
    {
        this.vueGSwing = vueGSwing;
    }
    
    public static void main(String[] args)
    {
        TestMVC test = new TestMVC();
    }
}
