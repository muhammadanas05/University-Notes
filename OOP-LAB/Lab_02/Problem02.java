import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {

        int x,y,z;

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        x = s1.nextInt();
        System.out.print("Enter the first number: ");
        y = s1.nextInt();
        System.out.print("Enter the first number: ");
        z = s1.nextInt();

        if (x>y && x>z){
            System.out.println("The 1st Number is the greatest among three");
        }
        else if (y>x && y>z) {
            System.out.println("The 2nd Number is the greatest among three");
        }
        else{
            System.out.println("The 3rd Number is the greatest among three");
        }
    }
}
