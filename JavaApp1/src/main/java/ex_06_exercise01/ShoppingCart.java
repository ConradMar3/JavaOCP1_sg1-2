/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_06_exercise01;

/**
 *
 * @author Conrad
 */
    public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "John Doe";
        String message;
                
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
       
        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
        // Iterate through and print out the items from the items array
        System.out.println("Items purchased: ");
        
        for (String item : items ){
           System.out.print(item + ", ");
        }
    }    
}