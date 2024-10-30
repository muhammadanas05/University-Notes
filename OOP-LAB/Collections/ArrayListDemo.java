/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.ArrayList;
/**
 *
 * @author DSU
 */
public class ArrayListDemo {
    // The Collections framework is defined in the java.util package

    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Tiger");
        animals.add("Lion");

        System.out.println("ArrayList: " + animals);
        
        //Get the element from the arraylist
    String str = animals.get(1);
    System.out.println("Element at index 1: " + str);
    
    // change the element of the array list
    animals.set(2, "Zebra");
    System.out.println("Modified ArrayList: " + animals);
    
    // remove element from index 2
    String removedElement = animals.remove(1);
    System.out.println("Updated ArrayList: " + animals);
    System.out.println("Removed Element: " + removedElement);
    
    
    // iterate using for-each loop
    System.out.println("Accessing individual elements:  ");

    for (String language : animals) {
      System.out.print(language);
      System.out.print(", ");
    }
    
    
    
    
    }
    
    
    
}


