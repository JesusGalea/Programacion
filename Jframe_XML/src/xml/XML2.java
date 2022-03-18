package xml;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XML2 {

    public void nodos() throws ParserConfigurationException, SAXException, IOException{
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(xmlRecords));
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(is);
        NodeList list = doc.getElementsByTagName("*");
        for (int i = 0; i < list.getLength(); i++) {
            Element element = (Element) list.item(i);
            System.out.println(element.getNodeName());
        }
        }
        static String xmlRecords =
        "<company>" +
        "<employee id='1001'>" +
                "<firstname>Tony</firstname>" + 
        "<lastname>Black</lastname>" +
                "<salary>100000</salary>" +
                "</employee>" +
        "<employee id='1002'>" +
        "<firstname>Luis</firstname>" + 
        "<lastname>Chocolatito</lastname>" +
                "<salary>100000</salary>" +
                "</employee>"  +
        "</company>";


}