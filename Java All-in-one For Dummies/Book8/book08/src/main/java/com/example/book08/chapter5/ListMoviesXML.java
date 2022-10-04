/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
import javax.xml.parsers.*; //→1
import org.xml.sax.*;
import org.w3c.dom.*;
import java.text.*;

public class ListMoviesXML {

    private static NumberFormat cf
            = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) //→11
    {
        Document doc = getDocument("movies.xml");
        Element root = doc.getDocumentElement();
        Element movieElement = (Element) root.getFirstChild();
        Movie m;
        while (movieElement != null) {
            m = getMovie(movieElement);
            String msg = Integer.toString(m.year);
            msg += ": " + m.title;
            msg += " (" + cf.format(m.price) + ")";
            System.out.println(msg);
            movieElement
                    = (Element) movieElement.getNextSibling();
        }
    }

    private static Document getDocument(String name) //→29
    {
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);
            DocumentBuilder builder
                    = factory.newDocumentBuilder();
            return builder.parse(new InputSource(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Movie getMovie(Element e) //→49
    {
// get the year attribute
        String yearString = e.getAttribute("year");
        int year = Integer.parseInt(yearString);
// get the Title element
        Element tElement = (Element) e.getFirstChild();
        String title = getTextValue(tElement).trim();
// get the Price element
        Element pElement
                = (Element) tElement.getNextSibling();
        String pString = getTextValue(pElement).trim();
        double price = Double.parseDouble(pString);
        return new Movie(title, year, price);
    }

    private static String getTextValue(Node n) //→65
    {
        return n.getFirstChild().getNodeValue();
    }

    private static class Movie //→70
    {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}


/*
Because all the code in this program appears elsewhere in this chapter, the following
paragraphs just provide a simple description of what each method in this
program does:

→1 Wow, that’s a lot of packages to import. Too bad that Java’s designers
couldn’t have put all these XML classes in one big package.

→11 The main method starts by calling the getDocument method to get a
Document object from the file movies.xml. Then it gets the root
element and uses a while loop to spin through all the child elements,
which you know to be Movie elements because the document was
validated when it was parsed. As each Movie element is processed, it’s
passed to the getMovie method, which extracts the year attribute and
the title and price elements, and returns a Movie object. Then the
movie is printed on the console.

→29 The getDocument method accepts a filename as a parameter and
returns a Document object. Before it creates the DocumentBuilder
object, it sets the configuration options so that comments and white
space are ignored and the XML file is validated. Because the XML file is
validated, you must create a DTD file (like the file in Listing 5-2 earlier in
this chapter). Also, you must begin the XML file with a DOCTYPE declaration
(such as <!DOCTYPE Movies SYSTEM "movies.dtd">).

→49 The getMovie method is passed an Element object that represents a
Movie element. It extracts the year attribute, gets the text value of the
title element, and parses the text value of the price element to a
double. Then it uses these values to create a new Movie object, which is
returned to the caller.

→65 The getTextValue method is simply a little helper method that gets the
text content from a node. This method assumes that the node has a
child node containing the text value, so you shouldn’t call this method
unless you know that to be the case. (Because the XML document was
validated, you do.)

→70 The Movie class is a private inner class that represents a single movie. It
uses public fields to hold the title, year, and price data, and it
provides a simple constructor that initializes these fields.
*/