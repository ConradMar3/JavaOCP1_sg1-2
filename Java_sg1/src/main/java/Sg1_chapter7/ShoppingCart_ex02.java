/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sg1_chapter7;

/**
 *
 * @author maria
 */
public class ShoppingCart_ex02 {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
          
        //Instantiate and initialize sb to firstName.
        sb = new StringBuilder(firstName);

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        sb.append(" Smith");
	
	// Challenge: sb.append(custName.substring(spaceIdx));

        System.out.println(sb);
    }    
}
