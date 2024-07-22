import java.util.Scanner;
public class Q1b {
    public static void main(String[] args) {

        System.out.print("Enter the value of n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }


            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }


            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}