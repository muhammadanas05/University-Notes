/*
 * THROW AND THROWS KEYWORDS
 */
package Exceptions;

/** 
 *
 * Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
 * Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
 */
public class TestThrows {
    
    void div(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        
        else
        {
            int c =a/b;
            System.out.println(c);
        }
    }
    
    public static void main(String[] args) throws ArithmeticException
    {
        TestThrows t = new TestThrows();
       try
       {
        t.div(20, 0);
       }
       catch(Exception e)
       {
           System.out.println("Value of b can not be zero");
       }
    }
}
