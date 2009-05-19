/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;


import gui.Estadisticas;
import gui.Home;
import gui.Login;
import gui.guiCliente;
import gui.guiIngreso;
import interfaz.cargarSistema;

import interfaz.mensajeriaInstantanea;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;
import org.w3c.dom.NodeList;

/**
 *
 * @author Victor
 */
public class RmiCliente {
    
        private static cargarSistema rmiServidor;
        
        private Login l;
        
        private String cadena ;

	private static Registry registro;
     
        private static mensajeriaInstantanea mi;

	private static String direccionServidor = "127.0.0.1";
private static String puertoServidor = "3232";

    public RmiCliente() {
        super();
        cadena = new String();
    }
        
     public static void conectarseAlServidor(Home hm,Login gi) {
		try {
			// obtener el registro
			registro = LocateRegistry.getRegistry(direccionServidor,
					(new Integer(puertoServidor)).intValue());
			// creando el objeto remoto
			rmiServidor = (cargarSistema) (registro
					.lookup("rmiServidor"));
                        mi = (mensajeriaInstantanea) (registro
					.lookup("rmiServidor"));
                        
                        gi.dispose();
                    hm.setVisible(true);                    
                       // estadJugador = (EstadisticasJugador) (registro
					//.lookup("rmiServidor"));
		} catch (RemoteException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "El servidor no esta disponible, prueba mas tarde!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        hm.dispose();
                         SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Login.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
                        gi.setVisible(true);
		} catch (NotBoundException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "El servidor no esta disponible, prueba mas tarde!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        hm.dispose();
                         SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Login.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
                        gi.setVisible(true);
                }
	}

	public void enviarMensaje(String mensaje) {
		try {
			// llamando el metodo remoto
			rmiServidor.recibirDatosJugador(mensaje);
		} catch (RemoteException re) {
			re.printStackTrace();
		}
	}   
        public String Consultas(String usuario, String tipo)
        {
            
        try {
            
           cadena = rmiServidor.consultaDatosJugador(usuario, tipo);
          return cadena;
        } catch (RemoteException ex) {
            Logger.getLogger(RmiCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cadena;
        }
          public void salirSistema(String usuario)
        {
        try {
            rmiServidor.sesionJugador(usuario);
        } catch (RemoteException re) {
			re.printStackTrace();
		}
        }
          
          public String nuevomsg(String usuario, String mensaje)
          {
        try {
           return(mi.nuevomsg(usuario, mensaje));
        } catch (RemoteException ex) {
            Logger.getLogger(RmiCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "nada";
          }
        
        public void salir(Home gc)
        {
             l=new Login();
            gc.dispose();
      JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Login.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
        
        
        l.setVisible(true);
            //guiIngreso gi=new guiIngreso();
            //gi.setVisible(true);
        }

}
