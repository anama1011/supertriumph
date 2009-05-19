/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

//RmiServidor.java
import gui.HomeAdmin;
import gui.Login;
import gui.guiCliente;
import gui.guiIngreso;
import gui.guiServidor;

import interfaz.cargarSistema;
import interfaz.mensajeriaInstantanea;
import java.io.IOException;
import java.net.InetAddress;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;
import org.xml.sax.SAXException;
import persistencia.ConsultaEstadisticas;

/**
 * @author casidiablo
 * 
 */
public class RmiServidor extends UnicastRemoteObject implements
		cargarSistema, mensajeriaInstantanea{
    
           

	private static HomeAdmin gs;
        
        private ConsultaEstadisticas ce;

	private int estePuerto;
        
        private Login ln;

	private String estaIP;

	private Registry registro;
        
      

	/**
	 * Este es el metodo constructor de la clase RmiServidor
	 */
	public RmiServidor() throws RemoteException {
		try {
			// obtener la direccion de este host.
			estaIP = (InetAddress.getLocalHost()).toString();
		} catch (Exception e) {

			throw new RemoteException("No se puede obtener la direccion IP.");
		}
		estePuerto = 3232; // asignar el puerto que se registra
		try {

			// crear el registro y ligar el nombre y objeto.
			registro = LocateRegistry.createRegistry(estePuerto);
			registro.rebind("rmiServidor", this);
		} catch (RemoteException e) {
			throw e;
		}
                
         
                
                JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/HomeAdmin.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
                gs = new HomeAdmin(this);
                gs.setVisible(true);
  }
//------------------------------------------------------------------//
    public void gestionServidor(boolean habilitado) throws RemoteException
    {  System.out.println("TRY");
        if(habilitado==false)
        {
            try {

                registro.unbind("rmiServidor");
            } catch (NotBoundException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (AccessException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else
        {
            registro.rebind("rmiServidor", this);
        }
        
    }
    public void salirSistema()
    {
        gs.dispose();
        ln = new Login();
         JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Login.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
        ln.setVisible(true);
        /*guiIngreso gi=new guiIngreso();
        gi.setVisible(true);*/
    }

   

    public String consultaDatosJugador(String usuario, String tipo) throws RemoteException {
        String aux = new String();
        ce = new ConsultaEstadisticas();
        if( tipo.equalsIgnoreCase("Globales"))
        {
            try {
                aux = ce.Estadisticastodos();
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        else if(tipo.equalsIgnoreCase("Personales"))
        {
            try {
                aux = ce.entrar(usuario);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
                Logger.getLogger(RmiServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        
       return aux;

            
    }
  public void sesionJugador(String usuario) throws RemoteException {
        gs.getJtUsuarios().setText(gs.getJtUsuarios().getText()+'\n'+"Salio del Sistema: "+usuario);
    }

    

    public void recibirDatosJugador(String usuario) throws RemoteException {
        gs.getJtUsuarios().setText(gs.getJtUsuarios().getText()+'\n'+usuario);
        
    }

    public String nuevomsg(String usuario, String mensaje) throws RemoteException {
        gs.getJtChat().setText(gs.getJtChat().getText()+'\n'+usuario+": "+mensaje);
        return gs.getJtChat().getText()+'\n'+usuario+": "+mensaje;
    }



    //-------------------------------------------------------------------------------//
}
