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
public class ArrayListRemoveAll {
   


    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages1 = new ArrayList<>();

        // insert element at the end of arraylist
        languages1.add("Java");
        languages1.add("English");
        languages1.add("C");
        languages1.add("Spanish");
        System.out.println("Languages1: " + languages1);

        // create another arraylist
        ArrayList<String> languages2 = new ArrayList<>();

        // add elements to the arraylist
        languages2.add("English");
        languages2.add("Spanish");
        System.out.println("Languages2: " + languages2);

        // remove all elements of ArrayList2 from ArrayList1
        languages1.removeAll(languages2);
        System.out.println("Languages1 after removeAll(): " + languages1);
    }
}

