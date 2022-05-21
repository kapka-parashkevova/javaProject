package operations;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.LocalDate;

/*
public class AddOperation {
    public void add(String name, int expiryDate, LocalDate dateOfReceipt, String manufacturer, String unit,
                    int count, Location location, String comment) throws ParserConfigurationException {
       // File xmlFile = new File("products.xml");
  //      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 //       try {
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document doc = builder.parse(xmlFile);
//            doc.getDocumentElement().normalize();
//            Element root = doc.getDocumentElement();
//            NodeList childNodes = root.getChildNodes();
//            for (int i = 0; i < childNodes.getLength(); i++) {
//                Node node = childNodes.item(i);
//
//                if (node.getNodeType() == Node.ELEMENT_NODE) {
//
////                 /   Element eElement = (Element) node;
////                    eElement.getElementsByTagName(Integer.parseInt(eElement.getAttribute(""))==roomNumber &&
////                            (Integer.parseInt(eElemen*getElementsByTagName("beds").item(0).getTextContent())
////                                    >=numberOfGuests));
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();

//        }
        try {
            File inputFile = new File("D:\\javaProject\\myProj\\src\\operations\\products.xml");
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // creating input stream
            Document doc = builder.parse(inputFile );

            //Xpath compiler
            //XPathFactory xpf = XPathFactory.newInstance();
            // XPath xpath = xpf.newXPath();

            //XPath Query
            // XPathExpression expr = xpath.compile("/");
            //Node attributeElement = (Node) expr.evaluate(doc, XPathConstants.NODE);

            //New Node
            Node childnode=doc.createElement("nameOfProduct");
            doc .appendChild(childnode);
            childnode.setTextContent("Chocolate");

            // writing xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            File outputFile = new File("src/input2.xml");
            StreamResult result = new StreamResult(outputFile );
            // creating output stream
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/