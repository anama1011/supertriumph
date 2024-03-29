/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Registro.java
 *
 * Created on 6/05/2009, 11:04:41 PM
 */
package gui;

import conexion.RmiCliente;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

/**
 *
 * @author arquitectura
 */
public class CrearPartida extends javax.swing.JFrame {
    private VerPerfilJugador pj;
    private Home gc;
    private String Usuario;
    /** Creates new form Registro */
    public CrearPartida(Home gc,String usuario) {
        initComponents();
        this.gc = gc;
        this.setSize(800, 625);
        this.setLocationRelativeTo(null);
this.Usuario=usuario;

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_partida = new javax.swing.JButton();
        BTN_perfil = new javax.swing.JButton();
        BTN_estadisticas = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jtNumJugadores = new javax.swing.JTextField();
        jtNombrePartida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(800, 625));
        setResizable(false);
        setUndecorated(true);

        BTN_partida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BTN_mpartida.png"))); // NOI18N
        BTN_partida.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_partida.setBorderPainted(false);
        BTN_partida.setContentAreaFilled(false);
        BTN_partida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BTN_mpartida_roll.png"))); // NOI18N

        BTN_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BTN_mperfil.png"))); // NOI18N
        BTN_perfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_perfil.setBorderPainted(false);
        BTN_perfil.setContentAreaFilled(false);
        BTN_perfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BTN_mperfil_roll.png"))); // NOI18N
        BTN_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_perfilActionPerformed(evt);
            }
        });

        BTN_estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BTN_mestadisticas .png"))); // NOI18N
        BTN_estadisticas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_estadisticas.setBorderPainted(false);
        BTN_estadisticas.setContentAreaFilled(false);
        BTN_estadisticas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BTN_mestadisticas_roll.png"))); // NOI18N
        BTN_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_estadisticasActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Modalidad1", "Modalidad2" }));

        jtNumJugadores.setText("4");

        jtNombrePartida.setText("Nombre de Partida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(BTN_partida)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtNumJugadores, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtNombrePartida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_perfil)
                        .addGap(32, 32, 32)
                        .addComponent(BTN_estadisticas))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(jbCancelar))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jtNombrePartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jtNumJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear)
                    .addComponent(jbCancelar))
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_partida)
                    .addComponent(BTN_perfil)
                    .addComponent(BTN_estadisticas))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        gc.setVisible(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void BTN_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_perfilActionPerformed
        // TODO add your handling code here:
        
          this.setVisible(false);
        pj = new VerPerfilJugador(Usuario,this.gc);
        JFrame.setDefaultLookAndFeelDecorated(true);

    SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
    //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
    SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/VerPerfilAdmin.jpg"));
    SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
        pj.setVisible(true);
    }//GEN-LAST:event_BTN_perfilActionPerformed

    private void BTN_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_estadisticasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
          JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Estadisticas.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
        
        Estadisticas Est = new Estadisticas(Usuario,this.gc.getRc(), this.gc);
        Est.setVisible(true);
    }//GEN-LAST:event_BTN_estadisticasActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Tablero t=new Tablero(this.gc);
        JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Tablero.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
        t.setVisible(true);
    }//GEN-LAST:event_jbCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
/*
        JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/CrearPartida.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CrearPartida().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_estadisticas;
    private javax.swing.JButton BTN_partida;
    private javax.swing.JButton BTN_perfil;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JTextField jtNombrePartida;
    private javax.swing.JTextField jtNumJugadores;
    // End of variables declaration//GEN-END:variables
}
