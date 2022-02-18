/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sg1_chapter8;

/**
 *
 * @author Conrad
 */
public class Item {
    char color;
    
    public boolean setColor (char color){
        if (color == ' ') {
            return false;
        }else{
            this.color = color;
            return true;
        }
    }
    // declare and code the setColor method
    
    
}
