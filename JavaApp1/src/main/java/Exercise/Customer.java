/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author maria
 */
public class Customer {
    String name = "John Doe";
    String adress = "School street.";
    String info = adress;
    int age = 32;
    int custNumber = 12;
    int orderNumber;
    
    public void requestDiscount() {
        System.out.println("request discount");
        
    }
    public void setAdress ( String adress ) {
        this.adress = adress;
        System.out.println("changed adress");
    }
    public void shop() {
        System.out.println("shopping");
    }
    public void displayCustomer() {
        System.out.println("customer is " + this.name);
    }
}
