package xml;

	import java.io.File;

	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;

	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import org.w3c.dom.Node;
	import org.w3c.dom.NodeList;
	import org.xml.sax.SAXException;

	public class XML1 {
	public void main(String[] args) throws ParserConfigurationException, SAXException{

	        leer();
	}

	public void leer() {
		try {
		    File file = new File("company.xml");

		    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		    DocumentBuilder db = dbf.newDocumentBuilder();
		    Document document = db.parse(file);
		    document.getDocumentElement().normalize();

		    NodeList nList = document.getElementsByTagName("employee");


		    for(int i = 0; i<nList.getLength(); i++) {
		        Node nNode = nList.item(i);
		        System.out.println("ElementoPrincipal: " + nNode.getNodeName());

		        if(nNode.getNodeType() == Node.ELEMENT_NODE) {
		            Element eElement = (Element) nNode;

		            System.out.println("ID: " + eElement.getAttribute("id"));

		            System.out.println("Primer nombre: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
		            System.out.println("Segundo nombre: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
		            System.out.println("Salario: " + eElement.getElementsByTagName("salary").item(0).getTextContent());
		        }
		    }

		    }catch (Exception e) {
		    System.out.println(e);
		}
	}
	}

