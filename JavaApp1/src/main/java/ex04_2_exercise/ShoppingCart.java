/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package ex04_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total
        
        double price = 17.95;
        int quantity = 4;
        double tax = 3.4;
        double total;
        
        // Modify message to include quantity.
        message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost.
        total = quantity * price * tax;
        
        System.out.println("Total cost with tax: "+total);
    }
    
}
