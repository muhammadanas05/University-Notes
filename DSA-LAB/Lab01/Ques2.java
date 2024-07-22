import java.util.Scanner;
public class Ques2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("First floating-point number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Second floating-point number: ");
            double num2 = scanner.nextDouble();

            if (checker(num1, num2)) {
                System.out.println("SAME");
            } else {
                System.out.println("DIFFERENT");
            }

            scanner.close();
        }
        static boolean checker(double num1, double num2) {

            int NUM1 = (int) (num1 * 1000);
            int NUM2 = (int) (num2 * 1000);

            return NUM1 == NUM2;
        }
    }


