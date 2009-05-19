/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mundo;
import gui.Login;
import javax.swing.JFrame;
import  org.jvnet.substance.*;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

/**
 *
 * @author arquitectura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Login.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
        
        Login l=new Login();
        l.setVisible(true);
        

    }

}
