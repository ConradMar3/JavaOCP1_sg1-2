/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_02_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
         // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase several items.";
                    
        //Declare and initialize the items String array
        String[] items = {"Scarf","Shirt","Scarf01","Beret"};
       
        // Change message to show the number of items purchased.  
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
        // Print an element from the items array.  
       
        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);
        System.out.println(items[01]);
        
        //System.out.println(items[4]); Error = count starts at 0.
    }    
}



