/**
 @author Junior
 */
package QUESTION_3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class StaffHandler extends DefaultHandler{
    
    private boolean inFirstName = false;
    private boolean inLastName = false;
    private boolean inRole = false;
    private boolean inSalary = false;
    private String currentEmployeeId;
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("employee")) {
            currentEmployeeId = attributes.getValue("id");
            System.out.println("\nEmployee ID: " + currentEmployeeId );
        }
        else if (qName.equalsIgnoreCase("firstName")) {
            inFirstName = true;
        }
        else if (qName.equalsIgnoreCase("lastName")) {
            inLastName = true;
        }
        else if (qName.equalsIgnoreCase("role")) {
            inRole = true;
        }
        else if (qName.equalsIgnoreCase("salary")) {
            inSalary = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content = new String(ch, start, length).trim();
        if (content.isEmpty()) return;

        if (inFirstName) {
            System.out.println("First Name: " + content);
            inFirstName = false;
        }
        else if (inLastName) {
            System.out.println("Last Name: " + content);
            inLastName = false;
        }
        else if (inRole) {
            System.out.println("Role: " + content);
            inRole = false;
        }
        else if (inSalary) {
            System.out.println("Salary: " + content);
            inSalary = false;
        }
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        System.err.println("Parsing error at line " + e.getLineNumber() + ": " + e.getMessage());
        throw e;
    }
    
}
