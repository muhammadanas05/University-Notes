/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author DSU
 */
public class TestException2 {
   public static void main(String [] args)
    {
       
        int data = 100;
        int result = 100/0;
        System.out.println("Result "+result);
        System.out.println("Text after Exception");
    } 
}
