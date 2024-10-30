
public class Q1a {
    public static void main(String[] args) {
        int[] numbers = {101, 45, 89, 33, 15, 97};
        int max = find(numbers);
        System.out.println("Max Num: " + max);
    }

    public static int find(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }

        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
}