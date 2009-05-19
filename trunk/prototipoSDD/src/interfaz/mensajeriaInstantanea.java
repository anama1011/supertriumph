/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author arquitectura
 */
public interface mensajeriaInstantanea extends Remote{
    String nuevomsg(String usuario,String mensaje)throws RemoteException;
    
}
