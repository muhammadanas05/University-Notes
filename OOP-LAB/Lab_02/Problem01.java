import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        String ch;

        System.out.print("Input an alphabet: ");
        Scanner s1 = new Scanner(System.in);
        ch = s1.next();
        System.out.print("Input letter is ");
        if((ch.length()==1) && Character.isLetter(ch.charAt(0))) {

            switch (ch) {

                case "a": {
                    System.out.println("Vowel");
                    break;
                }
                case "e": {
                    System.out.println("Vowel");
                    break;
                }
                case "i": {
                    System.out.println("Vowel");
                    break;
                }
                case "o": {
                    System.out.println("Vowel");
                    break;
                }
                case "u": {
                    System.out.println("Vowel");
                    break;
                }
                case "A": {
                    System.out.println("Vowel");
                    break;
                }
                case "E": {
                    System.out.println("Vowel");
                    break;
                }
                case "I": {
                    System.out.println("Vowel");
                    break;
                }
                case "O": {
                    System.out.println("Vowel");
                    break;
                }
                case "U": {
                    System.out.println("Vowel");
                    break;
                }
                default:{
                    System.out.println("Consonant");
                }
            }
        }
        else {
            System.out.println("ERROR! Re-enter single letter.");
        }
    }
}
