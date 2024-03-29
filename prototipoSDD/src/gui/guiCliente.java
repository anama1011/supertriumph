/*
 * guiCliente.java
 *
 * Created on 5 de mayo de 2009, 03:04 AM
 */

package gui;

import conexion.RmiCliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import persistencia.ConsultaEstadisticas;

/**
 *
 * @author  Victor
 */
public class guiCliente extends javax.swing.JFrame {
    private RmiCliente rc;
    private PerfilJugador pj;
    private String Usuario;
    private Estadisticas Est;

    /** Creates new form guiCliente */
    public guiCliente(String usuario,Login in) {
        initComponents();
        this.Usuario = usuario;
        this.rc=new RmiCliente();
       // this.rc.conectarseAlServidor(this,in);
        this.enviar();   
   

        
    }

    public Estadisticas getEst() {
        return Est;
    }

    public void setEst(Estadisticas Est) {
        this.Est = Est;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public JButton getJButton1() {
        return jButton1;
    }

    public void setJButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JPanel getJPanel1() {
        return jPanel1;
    }

    public void setJPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getJScrollPane1() {
        return jScrollPane1;
    }

    public void setJScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JButton getJbEnviar() {
        return jbEnviar;
    }

    public void setJbEnviar(JButton jbEnviar) {
        this.jbEnviar = jbEnviar;
    }

    public JButton getJbMenuEstadisticas() {
        return jbMenuEstadisticas;
    }

    public void setJbMenuEstadisticas(JButton jbMenuEstadisticas) {
        this.jbMenuEstadisticas = jbMenuEstadisticas;
    }

    public JButton getJbMenuPartida() {
        return jbMenuPartida;
    }

    public void setJbMenuPartida(JButton jbMenuPartida) {
        this.jbMenuPartida = jbMenuPartida;
    }

    public JButton getJbMenuPerfil() {
        return jbMenuPerfil;
    }

    public void setJbMenuPerfil(JButton jbMenuPerfil) {
        this.jbMenuPerfil = jbMenuPerfil;
    }

    public JLabel getJlNombre() {
        return jlNombre;
    }

    public void setJlNombre(JLabel jlNombre) {
        this.jlNombre = jlNombre;
    }

    public JTextArea getJtChat() {
        return jtChat;
    }

    public void setJtChat(JTextArea jtChat) {
        this.jtChat = jtChat;
    }

    public JTextField getJtMensaje() {
        return jtMensaje;
    }

    public void setJtMensaje(JTextField jtMensaje) {
        this.jtMensaje = jtMensaje;
    }

    public PerfilJugador getPj() {
        return pj;
    }

    public void setPj(PerfilJugador pj) {
        this.pj = pj;
    }

    public RmiCliente getRc() {
        return rc;
    }

    public void setRc(RmiCliente rc) {
        this.rc = rc;
    }
public void enviar()
{

        this.rc.enviarMensaje(this.Usuario); 
}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbMenuPartida = new javax.swing.JButton();
        jbMenuPerfil = new javax.swing.JButton();
        jbMenuEstadisticas = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtChat = new javax.swing.JTextArea();
        jtMensaje = new javax.swing.JTextField();
        jbEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMenuPartida.setText("Menu Partida");
        jbMenuPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuPartidaActionPerformed(evt);
            }
        });

        jbMenuPerfil.setText("Menu Perfil");
        jbMenuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuPerfilActionPerformed(evt);
            }
        });

        jbMenuEstadisticas.setText("Menu Estadisticas");
        jbMenuEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuEstadisticasActionPerformed(evt);
            }
        });

        jButton1.setText("Salir del Sistema");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtChat.setColumns(20);
        jtChat.setEditable(false);
        jtChat.setRows(5);
        jScrollPane1.setViewportView(jtChat);

        jbEnviar.setText("Enviar");
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbMenuEstadisticas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jbMenuPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbMenuPartida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbEnviar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(76, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbMenuPartida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMenuPerfil))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jbEnviar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMenuEstadisticas)
                .addGap(4, 4, 4)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMenuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuPerfilActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //pj = new PerfilJugador(Usuario, this);
        pj.setVisible(true);
    }//GEN-LAST:event_jbMenuPerfilActionPerformed

    private void jbMenuEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuEstadisticasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        /*this.Est = new Estadisticas(Usuario,rc, this);
        this.Est.setVisible(true);*/
        
    }//GEN-LAST:event_jbMenuEstadisticasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        this.setVisible(false);
        this.rc.salirSistema(this.Usuario);
        //this.rc.salir(this);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbMenuPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuPartidaActionPerformed
       /* // TODO add your handling code here:
       // CrearPartida cp=new CrearPartida(this);
        this.setVisible(false);
        cp.setVisible(true);*/
    }//GEN-LAST:event_jbMenuPartidaActionPerformed

    private void jbEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarActionPerformed
        // TODO add your handling code here:
        
        String men = this.rc.nuevomsg(this.Usuario, this.jtMensaje.getText());
        if(men.equals("nada"))
        {}
        else
        {
            this.jtChat.setText(men);
            }
        
    }//GEN-LAST:event_jbEnviarActionPerformed

    /**
    * @param args the command line arguments
    */
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiCliente().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JButton jbMenuEstadisticas;
    private javax.swing.JButton jbMenuPartida;
    private javax.swing.JButton jbMenuPerfil;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextArea jtChat;
    private javax.swing.JTextField jtMensaje;
    // End of variables declaration//GEN-END:variables

}
