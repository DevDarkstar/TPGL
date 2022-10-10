/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author rl109350
 */
public class TestMVC {
    
    //private Panier p;
    //private VueConsole vueConsole;
    private Controleur controleur;
    private VueGraphique vueg;
    
    public TestMVC()
    {
        //sans SpringIoC
        /*p = new Panier(5);
        vueConsole = new VueConsole();
        controleur = new Controleur();
        
        controleur.setPanier(p);    //setModele
        p.addObserver(vueg);
        p.addObserver(vueConsole);

        vueg.ajouteControleur(controleur);*/
    }
    
    public VueGraphique getVueg() //pour java bean
    { 
        return vueg; 
    }
    
    public void setVueg(VueGraphique vueg) //pour java bean
    { 
        this.vueg = vueg; 
    }
    
    public Controleur getControleur() {
        return controleur;
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }
    
    
    public static void main(String[] args)
    {
        //Sans SpringIoC
        //TestMVC test = new TestMVC();
        
        //Avec SpringIoC
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestMVC test = (TestMVC)context.getBean("MVC");
        
        test.setControleur( (Controleur)context.getBean("Controleur") );  //SpringIoC
        test.setVueg( (VueGraphique)context.getBean("VueG") );   //SpringIoC
         
        Panier p = new Panier(5); 
        test.getControleur().setPanier(p);  
        
        p.addObserver(test.getVueg());
        test.getVueg().ajouteControleur(test.getControleur());
        
        VueConsole vuec = new VueConsole();
        p.addObserver(vuec);
    }
}
