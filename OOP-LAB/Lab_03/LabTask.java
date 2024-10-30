import java.util.Scanner;

public class LabTask {
    public static void main(String[] args) {
        // CALCULATOR

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
       int n1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
       int n2 = sc.nextInt();

        System.out.println("The sum of two number is: "+ (n1+n2));
        System.out.println("The subtraction of two number is: " + (n1-n2));
        System.out.println("The product of two number is: "+ n1*n2);
        System.out.println("The Division of two number is: "+ n1/n2);
    }
}
