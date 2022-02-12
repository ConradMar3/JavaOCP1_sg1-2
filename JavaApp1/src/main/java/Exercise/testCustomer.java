/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author 
 */
public class testCustomer {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        
        customer1.age = 40;
        customer2.name = "Duke";
        
        customer1.displayCustomer();
        customer2.displayCustomer();
    }
}
