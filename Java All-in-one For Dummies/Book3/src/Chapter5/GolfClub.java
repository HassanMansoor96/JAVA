/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Chapter5;

//Adding fields to an interface

//Besides abstract methods, an interface can include final fields — that is, constants.
//Interface fields are used to provide constant values that are related to the
//interface.

public interface GolfClub {

    int DRIVER = 1;
    int SPOON = 2;
    int NIBLICK = 3;
    int MASHIE = 4;
}

//Here any class that implements the GolfClub interface has these four fields (that
//is, constants) available.