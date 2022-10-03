/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
public class page875GettingAttributeValues {
    
}

/*
Getting attribute values

To get the value of an element’s attribute, call the getAttribute method and pass
the name of the attribute as the parameter. This code returns the string value of
the attribute. Then you can convert this value to another type if necessary. Note
that the value may include some white space, so you should run the value through
the trim method to get rid of any superfluous white space.

Here’s an example that gets the year attribute from each movie in the movies.xml
file and determines the year of the oldest movie in the collection:

Element root = doc.getDocumentElement();
Element movie = (Element)root.getFirstChild();
int oldest = 9999;
while (movie != null)
{
String s = movie.getAttribute("year");
int year = Integer.parseInt(s);
if (year < oldest)
oldest = year;
movie = (Element)movie.getNextSibling();
}
System.out.println("The oldest movie in the file "
+ "is from " + oldest + ".");
*/
