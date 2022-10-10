/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fr.ufrsciencestech.panier;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author rl109350
 */
public class VueGSwing extends JFrame implements Observer{

    /**
     * Creates new form VueGSwing
     */
    public VueGSwing() {
        initComponents();
        this.inc.setName("Plus");
        this.pack();
        this.setVisible(true);
    }
    
    //accesseurs et mutateurs
    public JButton getInc()
    {
        return this.inc;
    }
    
    public JButton getDec()
    {
        return this.dec;
    }
    
    public JLabel getAffiche()
    {
        return this.affiche;
    }
    
    public void setAffiche(JLabel affiche)
    {
        this.affiche = affiche;
    }
    
    public void ajouteControleur(Controleur c)
    {
        this.getInc().addActionListener(c);
        this.getDec().addActionListener(c);
    }
    
    @Override
    public void update (Observable o, Object arg)
    {
        this.getAffiche().setText(((Integer)arg).toString());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inc = new javax.swing.JButton();
        affiche = new javax.swing.JLabel();
        dec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        inc.setText("+");
        inc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incActionPerformed(evt);
            }
        });
        getContentPane().add(inc);

        affiche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(affiche);

        dec.setText("-");
        getContentPane().add(dec);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VueGSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueGSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueGSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueGSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueGSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel affiche;
    private javax.swing.JButton dec;
    private javax.swing.JButton inc;
    // End of variables declaration//GEN-END:variables

}
