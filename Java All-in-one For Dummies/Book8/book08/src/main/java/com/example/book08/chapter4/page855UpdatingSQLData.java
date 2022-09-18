/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book08.chapter4;

/**
 *
 * @author Hassan
 */
public class page855UpdatingSQLData {
    
}

/*
Besides executing select statements, you can also use a Statement object
to execute
insert, update, or delete statements as well. To do that, call the
executeUpdate method instead of the executeQuery method. This method
returns an int value that indicates how many rows were updated. You can test the
return value to determine whether the data was properly updated.
Here’s a method that accepts a movie ID, a last name, and a first name, and then
inserts a row into the friend table:

private static void loanMovie(int id, String lastName,
String firstName)
{
    Connection con = getConnection();
    try
    {
        Statement stmt = con.createStatement();
        String insert = "insert into friend "
        + "(lastname, firstname, movieid) "
        + "values ("
        + "\"" + lastName + "\", \""
        + firstName + "\", " +
        + id + ")";
        int i = stmt.executeUpdate(insert);
        if (i == 1)
            System.out.println("Loan recorded.");
        else
            System.out.println("Loan not recorded.");
    }
    catch (SQLException e)
    {
        System.out.println(e.getMessage());
        System.exit(0);
    }
}
*/