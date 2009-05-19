/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import conexion.RmiServidor;
import gui.VerPerfilAdmin;
import gui.VerPerfiles;
import gui.guiCliente;
import java.awt.Color;
import java.io.IOException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import gui.guiIngreso;
/**
 *
 * @author arquitectura
 */
public class Perfiles {
//    private guiCliente gc;
//    private RmiServidor rs;

       public void entrar(VerPerfilAdmin in) throws ParserConfigurationException, SAXException,
            IOException, XPathExpressionException {

//        String usuario = in.getJtUsuario().getText();
//        String clave = in.getJtContrasena().getText();
 

        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        domFactory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document doc = builder.parse("http://72.29.81.246/~imindjav/directorio_Activo.xml");
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//Jugador/*/text()");

        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        for(int i =0; i < nodes.getLength(); i++)
        {
            //System.out.println(nodes.item(i).getNodeValue());
            in.getJtVerPerfiles().setText( in.getJtVerPerfiles().getText()+nodes.item(i).getNodeValue()+'\n');
            //gs.getJtUsuarios().setText(gs.getJtUsuarios().getText()+'\n'+ usuario); 
            }

    }
}
