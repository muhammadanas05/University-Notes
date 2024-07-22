Write a program for: insert(LA, K, ITEM)
a) K is not out of range
b) Item must be positive integer
c) Check user's entered ITEM at index K is greater or less than in an array at index K, if less than
insert it into the array otherwise not perform any operation, and prints the message 'ITEM’ at
index k is greater than user's entered ‘ITEM'.



import java.util.Scanner;

public class InsertArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] array = {10, 20, 30, 40, 50};
        int size = array.length;

        System.out.print("Enter the index (K): ");
        int k = scanner.nextInt();

        // Check if index K is out of range
        if (k < 0 || k > size) {
            System.out.println("Index out of range.");
            return;
        }

        System.out.print("Enter a positive integer (ITEM): ");
        int item = scanner.nextInt();

        // Check if ITEM is a positive integer
        if (item <= 0) {
            System.out.println("Please enter a positive integer for ITEM.");
            return;
        }

        // Check if ITEM at index K is less than the value in the array at index K
        if (k < size && item < array[k]) {
            // Insert ITEM into the array at index K
            insert(array, k, item);

            // Print the updated array
            System.out.print("Updated Array: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("ITEM at index " + k + " is greater than user's entered ITEM.");
        }
    }

    // Function to insert ITEM into array at index K
    private static void insert(int[] array, int k, int item) {
        // Shift elements to make space for the new item
        for (int i = array.length - 1; i > k; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new item
        array[k] = item;
    }
}
