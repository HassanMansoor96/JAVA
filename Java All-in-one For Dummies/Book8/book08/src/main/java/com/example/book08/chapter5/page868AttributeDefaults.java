/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter5;

/**
 *
 * @author Hassan
 */
public class page868AttributeDefaults {
    
}
/*
Attribute Defaults
Default Optional or Required?
#REQUIRED Required.
#IMPLIED Optional.
value Optional. This value is used if the attribute is omitted.
#FIXED value Optional. If included, however, it must be this value,
and if omitted, this value is used by default.
*/

/*
Here’s the ATTLIST tag declaration from movies.dtd:
<!ATTLIST Movie year CDATA #REQUIRED>
This declaration indicates that the attribute goes with the Movie element, is
named year, can be any kind of data, and is required.
Here’s an ATTLIST tag that specifies a list of possible values along with a default:
<!ATTLIST Movie genre (SciFi|Action|Comedy|Drama) Comedy>
This form of the ATTLIST tag lets you create an attribute that’s similar to an
enumeration,
with a list of acceptable values.
*/
