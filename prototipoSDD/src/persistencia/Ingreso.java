
package persistencia;

import conexion.RmiServidor;
import gui.Home;
import gui.Login;
import gui.guiCliente;
import java.awt.Color;
import java.io.IOException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import gui.guiIngreso;

/*
 * Nombre de la clase:                Ingreso.java
 * @author                            Victor Hugo Villalobos
 * Fecha de creación:                 28 de marzo de 2009, 03:33 PM
 * Fecha de última modificación:      modificación 17 de abril de 2009, 1:57 am
 * Funcionalidad:                     Por medio de esta clase se permite o no el ingreso de
 *                                    un jugador a DEMENTED MOVIE GAME, estableciendo la
 *                                    conexión con el servidor
 */
import gui.guiServidor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;
public class Ingreso{

    private Home hm;
    private RmiServidor rs;
/*
 * @params                No se reciben parametros.
 * @return                No hay retorno.
 * Proposito              Es el contructor de la clase.
 */
    public Ingreso() {
    }

 /*
 * @params                Objeto tipo ingreso.
 * @return                No hay retorno.
 * Proposito              El objetivo de este metodo es verificar que el nombre
 *                        de usuario y contraseña digitados por el usuario se
 *                        encuentren en el XML, para así permitir el ingreso del
 *                        usuario.
 */
    public void entrar(Login in) throws ParserConfigurationException, SAXException,
            IOException, XPathExpressionException {

        String usuario = in.getJTF_username().getText();
        String clave = in.getJTF_contrasena().getText();
 

        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        domFactory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document doc = builder.parse("http://72.29.81.246/~imindjav/directorio_Activo.xml");
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//Jugador[Usuario='" + usuario + "'][Clave='" + clave + "']/Usuario/text()");

        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        if (nodes.getLength() == 0) {
                 JFrame.setDefaultLookAndFeelDecorated(true);
                    SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        
           JOptionPane.showMessageDialog(null, "NOMBRE Y/O CONTRASEÑA INVALIDA(S)", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE); 
           JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Login.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
                   
        } else {
            for (int i = 0; i < nodes.getLength(); i++) {
                System.out.println(nodes.item(i).getNodeValue());
                if(in.getJTF_username().getText().equals("oquendo.tatiana"))
                {
                    in.dispose();
                    rs  = new RmiServidor();
                    
                    
                    
                }
                else
                {
                    JFrame.setDefaultLookAndFeelDecorated(true);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");//Ejemplo de aplicacion de un watermark de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("http://72.29.81.246/~imindjav/images/Home.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(1));
                    hm=new Home(in.getJTF_username().getText(),in);
                    
                }
            }
     
        }
    }
}