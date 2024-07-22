/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * Unchecked Exceptions occur at run time and these exceptions does not require to be handled
 */
public class UncheckedException {
    
    public static void printLength(String myString)
    {
        System.out.println(myString.length());
    }
    
    public static void tableOf2()
    {
        for(int i=1; i<=10; i++)
                {
                    int result = 2 * i; 
                    System.out.println("2 * "+i+" = "+result);
                }
    }
    public static void main(String [] args)
    {
        //String name = "John"; 
        try
        {
        String name = null;
        printLength(name);
        }
        catch(NullPointerException e)
        {
           System.out.println(e); 
        }
        
        
        tableOf2();
        
    }
}
