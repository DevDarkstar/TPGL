/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.panier;

import java.awt.Component;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author richa
 */
public class VueGraphiqueTest {
    private static VueGraphique vueg;
    private Controleur c; //contrôleur associé à la vue
    private Panier p;
    
    public VueGraphiqueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vueg = new VueGSwing();
        p = new Panier(2);
        c = new Controleur();
        c.setPanier(p);
        p.addObserver(vueg); //la vue observe le modèle (panier)
        vueg.ajouteControleur(c); //on associe le contrôleur à la vue
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class VueGraphique.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable m = null;
        Object o = null;
        VueGraphique instance = new VueGraphiqueImpl();
        instance.update(m, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouteControleur method, of class VueGraphique.
     */
    @Test
    public void testAjouteControleur() {
        System.out.println("ajouteControleur");
        Controleur cntrlr = null;
        VueGraphique instance = new VueGraphiqueImpl();
        instance.ajouteControleur(cntrlr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testStoryAjouteRetire() { //test d’acceptation
        assertNotNull(vueg); // Instantiated?
        JLabel res = (JLabel)TestUtils.getChildNamed((Component) vueg, "Affichage");
        assertNotNull(res); // Component found?
        final JButton plus = (JButton)TestUtils.getChildNamed((Component) vueg, "Plus");
        assertNotNull(plus);
        final JButton moins = (JButton)TestUtils.getChildNamed((Component) vueg, "Moins");
        assertNotNull(moins);
        plus.doClick();
        assertEquals(res.getText(), "1");
        moins.doClick();
        assertEquals(res.getText(), "0");
    }

    public class VueGraphiqueImpl implements VueGraphique {

        @Override
        public void update(Observable m, Object o) {
        }

        @Override
        public void ajouteControleur(Controleur cntrlr) {
        }
    }
    
}
