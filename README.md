# Staff Information Management System (XML + SAX Parser)

A lightweight, platform-independent system that stores employee records in XML format. Implemented a Java-based SAX parser to efficiently read and display employee data without loading the entire XML file into memory, with proper error handling and structured data extraction.

## Project Overview

This system was developed as part of a Software Engineering module to manage staff records stored in XML format. Unlike traditional DOM parsing, which loads an entire XML document into memory, this application uses the **SAX (Simple API for XML) parser** to read the file sequentially and process records on the fly. This makes it highly memory-efficient and suitable for large datasets.

## The Engineering Problem

Traditional DOM (Document Object Model) parsing loads an entire XML file into memory at once. For large datasets, this can cause performance bottlenecks or `OutOfMemoryError` crashes. This project solves that problem by using an event-driven approach.

## The Solution

The application implements a Java-based SAX parser that:
- Reads the XML file **sequentially** without loading it all into memory.
- Triggers events (`startElement`, `characters`, `endElement`) as it encounters each piece of data.
- Extracts and stores employee records in a structured format.
- Displays the parsed records to the user.

## Tech Stack

- **Language:** Java
- **Parsing:** XML, SAX Parser (event-driven)
- **IDE:** NetBeans

## Key Features

- **Memory-Efficient Parsing:** Reads large XML files without loading them entirely into memory.
- **Structured Data Extraction:** Extracts employee details (name, ID, department, etc.) from XML elements and attributes.
- **Event-Driven Processing:** Uses SAX event handlers to process data as it is encountered.
- **Error Handling:** Handles malformed XML and parsing exceptions gracefully.
- **Platform-Independent:** Runs on any system with a Java Runtime Environment.

## Architecture & Code Structure

| File                            | Role                                                                                                                                        |
| ------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `StaffSAXParser.java`           | **Parser:** Extends `DefaultHandler` and overrides SAX event methods (`startElement`, `endElement`, `characters`) to extract employee data. |
| `StaffHandler.java`             | **Handler:** Manages the parsed staff records and provides methods to store and display them.                                               |
| `staff.xml`                     | **Data Source:** The XML file containing employee records to be parsed.                                                                     |


## Engineering Highlights

- **Memory Optimization:** Unlike DOM, SAX does not build a tree in memory. This makes it ideal for processing large XML files on systems with limited memory.
- **Event-Driven Design:** Implemented custom event handlers to process XML data as it streams in, rather than waiting for the entire file to load.
- **Robust Error Handling:** Handled `SAXException`, `ParserConfigurationException`, and `IOException` to ensure the application fails gracefully.
- **Structured Parsing:** Correctly distinguished between XML elements and attributes during extraction.

## What I Learned

- The difference between DOM (tree-based) and SAX (event-driven) parsing.
- How to process XML files efficiently in Java.
- Writing event-driven parsing code using `DefaultHandler`.
- Handling large data files with limited memory.
- Structuring a Java project with clear separation between parsing logic and data management.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/GRJuniorselemela-se/staff-information-management-system.git
   ```
2. Open the project in NetBeans (or any Java IDE).
3. Ensure the `staff.xml` file is in the correct directory as referenced by your parser.
4. Locate and run the main class (`StaffHandler.java` or `StaffSAXParser.java`).
5. The application will parse the XML file and display the extracted employee records.


## Sample XML Structure

```xml
<staff>
    <employee id="101">
        <name>John Doe</name>
        <department>IT</department>
        <position>Developer</position>
    </employee>
    <employee id="102">
        <name>Jane Smith</name>
        <department>HR</department>
        <position>Manager</position>
    </employee>
</staff>
```

## Future Improvements

- Database Integration: Store parsed records in a relational database instead of just displaying them.
- GUI Interface: Add a JavaFX interface to allow users to browse and search employee records visually.
- Multiple File Support: Extend the parser to handle multiple XML files in batch.
- Unit Testing: Implement JUnit tests to verify parser behavior with edge cases (malformed XML, missing elements).
- Export Functionality: Add the ability to export parsed data to CSV or JSON.

## Academic Context

- Developed during Programming in Java (ITJVA2) as part of a second-year Software Engineering curriculum.

## Author

**Gomolemo Reggy Junior Selemela**

Software Engineering Student | Aspiring Software Developer/ Software Engineer (Java)
- **GitHub:** [github.com/GRJuniorselemela-se](https://github.com/GRJuniorselemela-se)
- **LinkedIn:** [linkedin.com/in/grjunior-selemela](https://www.linkedin.com/in/grjunior-selemela)
- **Email:** [juniorselemela@gmail.com](mailto:juniorselemela@gmail.com)
