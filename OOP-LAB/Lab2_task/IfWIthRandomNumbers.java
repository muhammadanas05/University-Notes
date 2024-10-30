import java.util.Random;

public class IfWIthRandomNumbers {
    public static void main(String[] args) {
       // Example#4

        Random random = new Random();
        int n = random.nextInt();
        System.out.println("n= "+ n);
        if (n > 0){
            System.out.println("n>0");
        }
        else {
            System.out.println("n<0");
        }
    }
}
