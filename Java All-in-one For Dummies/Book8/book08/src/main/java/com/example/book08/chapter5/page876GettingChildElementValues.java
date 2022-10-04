/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
public class page876GettingChildElementValues {
    
}


/*
Getting child element values

You may be surprised to find that the text content of an element isn’t stored with
the element. Instead, it’s stored in a child node of type Text. Consider the following
XML:

<Title>The Princess Bride</Title>

This element results in two nodes in the XML document: an Element node named
Title and a Text node that contains the text The Princess Bride.

Thus, if you have a Title element in hand, you must get the Text element before
you can get the text content, as in this example:

Node textElement = titleElement.getFirstChild();
String title = textElement.getNodeValue();
*/
