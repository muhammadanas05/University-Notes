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
public class ArrayListAddAll {
    
  public static void main(String[] args) {

    // create an arraylist
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("Python");
    System.out.println("Languages: " + languages);

    // create another arraylist
    ArrayList<String> programmingLang = new ArrayList<>();

    // add all elements from languages to programmingLang
    programmingLang.addAll(languages);

    System.out.println("Programming Languages: " + programmingLang);
  }
}

