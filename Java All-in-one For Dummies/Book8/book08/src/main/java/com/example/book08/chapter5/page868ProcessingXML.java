/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
public class page868ProcessingXML {
    
}

/*
Processing XML in Two Ways:
DOM and SAX
In general, you can use either of two approaches to process XML documents in a
Java program:
»»DOM: Stands for Document Object Model. The basic idea of DOM is that you
read an entire XML document from a file into memory, where the document
is stored as a collection of objects that are structured as a tree. Then you can
process the elements of the tree (called nodes) however you want. If you
change any of the nodes, you can write the document back to a file.
»»SAX: Stands for Simple API for XML. SAX is a read-only technique for processing
XML that lets you read the elements of an XML document from a file and
react to them as they come. Because SAX doesn’t require you to store an
entire XML document in memory at one time, it’s often used for very large
XML documents.
*/


/*
Reading a DOM Document
Before you can process a DOM document, you have to read the document into
memory from an XML file. You’d think that this would be a fairly straightforward
proposition, but unfortunately, it involves some pretty strange incantations. Rather
than go through all the classes and methods you have to use, I just look at the finished
code for a complete method that accepts a String containing a filename as
a parameter and returns a document object as its return value. Along the way, you
find out what each class and method does.
*/