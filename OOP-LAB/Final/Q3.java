import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MINIMUM Age: ");
        int miniAge = scanner.nextInt();
        System.out.print("Enter the MAXIMUM Age: ");
        int maxAge = scanner.nextInt();
        System.out.print("Enter Current Age: ");
        int mariasAge = scanner.nextInt();
        boolean isEligible = mariasAge >= miniAge && mariasAge < maxAge;
        if (isEligible) {
            System.out.println("Maria is eligible to take the exam.");
        } else {
            System.out.println("Maria is not eligible to take the exam.");
        }
        scanner.close();
    }
}