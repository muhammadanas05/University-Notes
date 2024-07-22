/*
 * Exception Handling of Arithmetic Exception
 */
package Exceptions;

/**
 *
 * @author DSU
 */
public class TestException {
    public static void main(String [] args)
    {
        try
        {
        int data = 100;
        int result = 100/0;
         System.out.println("Result "+result);
        }
        
        catch(Exception e){
        System.out.println("Exception occurs"+ e);
        }
        System.out.println("Text after Exception");
    }
}
