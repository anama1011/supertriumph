/*
 * HabilitarServidor.java
 *
 * Created on 6 de mayo de 2009, 08:51 PM
 */

package gui;

import conexion.RmiServidor;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  arquitectura
 */
public class HabilitarServidor extends javax.swing.JFrame {
    RmiServidor rs;
    HomeAdmin gs;
    /** Creates new form HabilitarServidor */
    public HabilitarServidor(RmiServidor rs, HomeAdmin gs) {
        initComponents();
        this.rs = rs;
        this.gs = gs;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcHabilitado = new javax.swing.JCheckBox();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcHabilitado.setSelected(true);
        jcHabilitado.setText("habilitado");

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jcHabilitado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jcHabilitado)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAceptar)
                    .addComponent(jbCancelar))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        try {
            if(this.jcHabilitado.isSelected()==true)
            {
                rs.gestionServidor(true);
            }
            else
            {
                rs.gestionServidor(false);
            }
//GEN-LAST:event_jbAceptarActionPerformed
        } catch (RemoteException ex) {
            Logger.getLogger(HabilitarServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
                // TODO add your handling code here:
                 this.dispose();
                 gs.setVisible(true);
            }//GEN-LAST:event_jbCancelarActionPerformed
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     *//*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HabilitarServidor().setVisible(true);
            }
        });
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JCheckBox jcHabilitado;
    // End of variables declaration//GEN-END:variables
    
}
