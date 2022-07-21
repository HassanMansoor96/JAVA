/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Hassan
 */
class CrazyClass {

    private String firstString;
    private String secondString;

    public CrazyClass(String first, String second) {
        //this(first);
        secondString = second;
    }

    public CrazyClass(String first) {
        this(first, "DEFAULT"); // error: won't
// compile
    }
}
