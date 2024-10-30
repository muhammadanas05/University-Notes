import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        int days = getNOD(month);

        if (days != -1) {
            System.out.println("Number of days in the month: " + days);
        } else {
            System.out.println("Invalid month entered.");
        }

        scanner.close();
    }

    public static int getNOD(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return 28; // Assuming non-leap year

            default:
              System.out.println("Give a proper number of month between (1-12)"); // Invalid month
        }
        return -1;
    }
}