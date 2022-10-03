/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
public class page872getDocumentMethod {
    
}

/*
Using the getDocument method
By adding the getDocument method, you can create a DOM document from a file
with a single statement, like this:
Document doc = getDocument("movies.xml");
Here the movies.xml file is read, and a DOM document is created and assigned to
the doc variable.
Also note that you must provide three import statements to use the getDocument
method, as follows:
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
DocumentBuilder and DocumentBuilderFactory are in the javax.xml.parsers
package, Document is in org.w3c.dom, and InputSource is in org.xml.sax.
*/
