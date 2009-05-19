/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;
import gui.Estadisticas;
import gui.guiCliente;
import java.rmi.*;
import org.w3c.dom.NodeList;

/**
 *
 * @author Victor
 */
public interface cargarSistema extends Remote{
    
    void recibirDatosJugador(String usuario) throws RemoteException;
    String consultaDatosJugador(String usuario, String tipo ) throws RemoteException;
    void sesionJugador(String usuario) throws RemoteException;
}
