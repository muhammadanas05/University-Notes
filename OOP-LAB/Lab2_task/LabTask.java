import java.util.Random;

public class LabTask {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt();
        System.out.println("Random number is: "+ n);
        if(n%2==0){
            System.out.println("Its divisible by 2");
        }s
        else if(n%3==0){
            System.out.println("Its divisible by 3");
        }
        else if(n%5==0) {
            System.out.println("Its divisible by 5");
        }
        else {
            System.out.println("Not divisible by 2,3 or 5");
        }
    }
}
