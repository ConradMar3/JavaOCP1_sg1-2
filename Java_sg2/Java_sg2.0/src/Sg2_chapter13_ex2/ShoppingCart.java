/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sg2_chapter13_ex2;

/**
 *
 * @author Conrad
 */
import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList();
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        cart.removeItemFromCart("Shirt");
    }
    
    public void fillCart(){
        items.add(new Shirt(40.95,'M','R'));
        items.add(new Shirt(32.99,'M','Y'));
        items.add(new Trouser(59.99,34,'B',"Relaxed",'M'));
        items.add(new Trouser(75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
items.removeIf(s -> s.getDesc().equals(desc));
        System.out.println(items);
        // remove all Trousers from the items list, then print out the list
        
    }
    
}
