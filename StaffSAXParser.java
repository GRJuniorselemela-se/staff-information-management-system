/**
 @author Junior
 */
package QUESTION_3;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class StaffSAXParser {
    
    public static void main(String[] args) throws Exception {
        
        File xmlFile = new File("C:/First Java Class/Staff.XML");
       
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        StaffHandler handler = new StaffHandler();
        saxParser.parse(xmlFile, handler);

        System.out.println("\nXML parsing completed successfully.");
    }
}
