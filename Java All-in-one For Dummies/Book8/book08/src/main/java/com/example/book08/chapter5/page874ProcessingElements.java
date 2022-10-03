/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
public class page874ProcessingElements {
    
}


/*
Processing elements
Assuming that you use a DTD to validate the XML file when you build the document,
you can usually navigate the document to pick up the information you need
without resorting to NodeList objects. Here’s a routine that simply counts all the
Movie elements in the movies.xml file (shown in Listing 5-1 earlier in this chapter)
after it’s been parsed into a Document object named doc:

int count = 0;
Element root = doc.getDocumentElement();
Node movie = root.getFirstChild();
while (movie != null)
{
count++;
movie = movie.getNextSibling();
}
System.out.println("There are " + count + " movies.");

This method first calls the getFirstChild method to get the first child of the root
element. Then it uses each child element’s getNextSibling method to get the
next element that’s also a child of the root element.

If you run a program that contains these lines, the following line appears on the
console:

There are 10 movies.

This program doesn’t do anything with the Movie elements other than count
them, but in the next section (“Getting attribute values”), you see how to extract
data from the Movie elements.
*/