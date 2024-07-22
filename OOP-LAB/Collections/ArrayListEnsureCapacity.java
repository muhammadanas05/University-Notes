/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.ArrayList;

/**
 *
 The Java ArrayList ensureCapacity() method sets the size of an arraylist with the specified capacity.
 */
public class ArrayListEnsureCapacity {



  public static void main(String[] args) {
    ArrayList<String> languages= new ArrayList<>();

    // set the capacity of the arraylist
    languages.ensureCapacity(3);

    // Add elements in the ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("C");
    System.out.println("ArrayList: " + languages);
  }
}

