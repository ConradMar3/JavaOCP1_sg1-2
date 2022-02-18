/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sg1_chapter7;

/**
 *
 * @author Conrad
 */
public class ShoppingCart_ex01 {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        String lastName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");

	// Use the substring method to parse out the first name and print it.
        firstName = custName.substring(2, spaceIdx);
        lastName = custName.substring(spaceIdx);
        System.out.println(lastName);
    }
}
