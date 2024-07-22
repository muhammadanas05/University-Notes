import java.util.Scanner;
public class Qeues3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the 1st: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the 2nd: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the 3rd: ");
            double num3 = scanner.nextDouble();

            checker(num1, num2, num3);

            scanner.close();
        }

        private static void checker(double num1, double num2, double num3) {
            if (isIncreasingOrder(num1, num2, num3)) {
                System.out.println("Increasing ");
            } else if (isDecreasingOrder(num1, num2, num3)) {
                System.out.println("Decreasing ");
            } else {
                System.out.println("Neither ");
            }
        }

        private static boolean isIncreasingOrder(double num1, double num2, double num3) {
            return num1 < num2 && num2 < num3;
        }

        private static boolean isDecreasingOrder(double num1, double num2, double num3) {
            return num1 > num2 && num2 > num3;
        }
    }


