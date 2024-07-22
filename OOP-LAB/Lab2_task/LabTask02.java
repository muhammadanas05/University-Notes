import java.util.Scanner;
public class LabTask02 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String Month;
        System.out.println("Enter Month Name: ");
        Month = myObj.nextLine();

        String sub = Month.substring(0, 3);

        sub = sub.toUpperCase();
        System.out.println(sub);

        switch(sub){
            case "JAN":
            {
                System.out.println("This is month 1 and have 31 days");
                break;
            }

            case "FEB":
            {
                System.out.println("This is month 2 and have 28 days");
                break;
            }

            case "MAR":
            {
                System.out.println("This is month 3 and have 31 days");
                break;
            }

            case "APR":
            {
                System.out.println("This is month 4 and have 30 days");
                break;
            }

            case "MAY":
            {
                System.out.println("This is month 5 and have 31 days");
                break;
            }

            case "JUN":
            {
                System.out.println("This is month 6 and have 30 days");
                break;
            }

            case "JUL":
            {
                System.out.println("This is month 7 and have 31 days");
                break;
            }

            case "AUG":
            {
                System.out.println("This is month 8 and have 31 days");
                break;
            }

            case "SEP":
            {
                System.out.println("This is month 9 and have 30 days");
                break;
            }

            case "OCT":
            {
                System.out.println("This is month 10 and have 31 days");
                break;
            }

            case "NOV":
            {
                System.out.println("This is month 11 and have 30 days");
                break;
            }

            case "DEC":
            {
                System.out.println("This is month 12 and have 31 days");
                break;
            }

            default:
            {
                System.out.println("Invalid month entered");
            }
        }
    }
}
