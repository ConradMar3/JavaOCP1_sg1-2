/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sg2_chapter12_ex3;

/**
 *
 * @author maria
 */
public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item item = new Shirt(99.95, 'M', 'G');

        // Test for non-Shirt object type
        //  Item item = new Item();
        
        // call the display method on the object, then the getColor method
        item.display();
        if (item instanceof Shirt) {
            String color = ((Shirt) item).getColor('C');
            System.out.println("Color: " + color);
        }else System.out.println("Item isn't a shirt.");
    }
}
