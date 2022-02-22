/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sg2_chapter12_ex2;

/**
 *
 * @author maria
 */
public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    // Override display() in the superclass to also show size and colorCode.
    public void display() {
        super.display();
        System.out.println("\tSize: " +size);
        System.out.println("\tColor: " +colorCode);
    }
}
    
    //   Avoid duplicating code.

