/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import conexion.RmiServidor;
import gui.Estadisticas;
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
public class ConsultaEstadisticas {

    public ConsultaEstadisticas() {
    }
    

    public String entrar(String usuario) throws ParserConfigurationException, SAXException,
            IOException, XPathExpressionException {
        String aux = new String();    
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        domFactory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document doc = (Document) builder.parse("http://72.29.81.246/~imindjav/estadisticas.xml");
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//EstadisticaJugador[Usuario='" + usuario + "']/*/text()");
// XPathExpression expr = xpath.compile("//Jugador[Usuario='" + usuario + "'][Clave='" + clave + "']/Usuario/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        for(int i =0; i < nodes.getLength(); i++)
        {
            aux+=nodes.item(i).getNodeValue()+'\n';
            
            }
         return aux;       
    }
    public String Estadisticastodos()throws ParserConfigurationException, SAXException,
            IOException, XPathExpressionException{
         String aux = new String(); 
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        domFactory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document doc = (Document) builder.parse("http://72.29.81.246/~imindjav/estadisticas.xml");
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        XPathExpression expr = xpath.compile("//EstadisticaJugador/*/text()");
// XPathExpression expr = xpath.compile("//Jugador[Usuario='" + usuario + "'][Clave='" + clave + "']/Usuario/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        
         for(int i =0; i < nodes.getLength(); i++)
        {
            aux+=nodes.item(i).getNodeValue()+'\n';
            
            }
        return aux;
        }
   
}
