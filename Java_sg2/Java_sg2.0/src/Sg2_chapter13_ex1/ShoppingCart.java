/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sg2_chapter13_ex1;

/**
 *
 * @author maria
 */
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args){
        
            String[] days = {"monday","saturday","tuesday","sunday","friday"};            
            
            // Convert the days array into an ArrayList
            // Loop through the ArrayList, printing out "sunday" elements in 
            //   upper case (use toUpperCase() method of String class) 
            // Print all other days in lower case 
            // Print out the ArrayList 
            
            ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
            for (String s : dayList){
               if (s.equals("sunday")){
                   System.out.println(s.toUpperCase());
               }
               else System.out.println(s);
            }
            System.out.println(dayList);            
    }
}

