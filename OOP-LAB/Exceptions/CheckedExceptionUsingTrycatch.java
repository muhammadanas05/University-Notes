/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;
import java.io.FileReader;
import java.io.FileNotFoundException; 

/**
 *
 *  A checked exception is caught at compile time and here we are dealing with it by using try catch block
 */
public class CheckedExceptionUsingTrycatch {
    
    public static void readFile(String FileName)
    {
        //Method 1
        try
        {
          FileReader reader = new FileReader(FileName);  
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
    
    public static void main(String [] args)
    {
             
    readFile("MyJavaDemoFile");
    }
    
}
