package operations;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Parser {

    public  void readXML() {

        try {
            File inputFile = new File("D:\\javaProject\\myProj\\src\\operations\\products.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("product");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Product name :" + eElement.getAttribute("nameOfProduct"));
                    System.out.println("Expiry Date:" + eElement.getElementsByTagName("expiryDate").item(0).getTextContent());
                    System.out.println("Date of receipt :" + eElement.getElementsByTagName("dateOfReceipt").item(0).getTextContent());
                    System.out.println("Manufacturer:" + eElement.getElementsByTagName("manufacturer").item(0).getTextContent());
                    System.out.println("Unit:" + eElement.getElementsByTagName("unit").item(0).getTextContent());
                    System.out.println("Count:" + eElement.getElementsByTagName("count").item(0).getTextContent());
                    System.out.println("Location:" + eElement.getElementsByTagName("location").item(0).getTextContent());
                    System.out.println("Comment:" + eElement.getElementsByTagName("comment").item(0).getTextContent());
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                }
              }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
