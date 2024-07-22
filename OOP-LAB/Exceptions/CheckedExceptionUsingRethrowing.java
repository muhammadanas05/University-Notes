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
 * A checked exception is caught at compile time and here we are dealing with it by re-throwing it
 */
public class CheckedExceptionUsingRethrowing {
     public static void readFile(String FileName)throws FileNotFoundException
    { 
          FileReader reader = new FileReader(FileName);  
    }
    
    public static void main(String [] args)
    {
     try
     {
    readFile("MyJavaDemoFile");
    }
     catch(FileNotFoundException fnf)
             {
                 System.out.println(fnf);
             }
}
}