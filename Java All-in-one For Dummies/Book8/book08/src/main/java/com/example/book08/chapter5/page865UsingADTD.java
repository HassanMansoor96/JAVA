/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
public class page865UsingADTD {
    
}

/*
Using a DTD
An XML document can have a DTD, which spells out exactly what elements can
appear in an XML document and in what order the elements can appear. DTD
stands for Document Type Definition, but that won’t be on the test.
A DTD for an XML document about movies, for example, may specify that each
Movie element must have Title and Price subelements and an attribute named
year. It can also specify that the root element must be named Movies and consist
of any number of Movie elements.
The main purpose of the DTD is to spell out the structure of an XML document so
that users of the document know how to interpret it. Another, equally important
use of the DTD is to validate the document to make sure that it doesn’t have any
structural errors. If you create a Movies XML document that has two titles for a
movie, for example, you can use the DTD to detect the error.
You can store the DTD for an XML document in the same file as the XML data,
but more often, you store the DTD in a separate file. That way, you can use a DTD
to govern the format of several XML documents of the same type. To indicate the
name of the file that contains the DTD, you add a <!DOCTYPE> declaration to the
XML document. Here’s an example:
<!DOCTYPE Movies SYSTEM "movies.dtd">
Here the XML file is identified as a Movies document, whose DTD you can find in
the file movies.dtd. Add this tag near the beginning of the movies.xml file, right
after the <?xml> tag.
*/
