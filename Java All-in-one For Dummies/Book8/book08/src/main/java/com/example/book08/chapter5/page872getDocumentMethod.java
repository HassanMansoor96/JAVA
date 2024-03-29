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

/*
Reading DOM Nodes
After you have a DOM document in memory, you can easily retrieve data from the
document’s nodes. The DOM API is based on interfaces rather than classes, so
each node of the DOM document is represented by an object that implements one
or more DOM interfaces. The following paragraphs give you an overview of the
interfaces you need to work with:

»»Document: The entire document is represented by an object that implements
the Document interface. The method you use most from this interface is
getDocumentElement, which returns an Element object that represents the
document’s root node. After you have the root node, you can navigate to
other nodes in the document to get the information you’re looking for.

»»Node: The Node interface represents a node in the DOM document. This
interface provides methods that are common to all nodes. Table 5-4 lists the
most useful of these methods. This table also lists some of the field values
that the getNodeType method can return.

»»Element: The Element interface represents nodes that correspond to
elements in the XML document. Element extends Node, so any object that
implements Element is also a Node. Table 5-5 lists some of the most useful
methods of this interface.

»»Text: The text content of an element isn’t contained in the element itself, but
in a Text node that’s stored as a child of the element. The Text interface has
a few interesting methods you may want to look up, but for most applications,
you just use the getNodeValue method inherited from the Node interface to
retrieve the text stored by a text node.

»»NodeList: A NodeList is a collection of nodes that’s returned by methods
such as the getChildNodes method of the Node interface or the get
ElementsByTagName of the Element interface. NodeList has just two
methods: item(int i), which returns the node at the specified index,
and getLength(), which returns the number of items in the list. (As with
almost every other index in Java, the first node is index 0, not 1.)
*/
