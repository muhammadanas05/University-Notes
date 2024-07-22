Write a program for: search(LA,ITEM) in Java
a) Search whether the user's entered item is exist or not in the array if exist perform following
b) Print two right neighbors(item/value) in case no right neighbor print message 'no right neighbor'
c) Print two left neighbors(item/value) in case no left neighbor print message 'no left neighbor'


import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Enter the item to search: ");
        int item = scanner.nextInt();

        // Call the search function
        search(array, item);
    }

    // Function to search for the ITEM in the array
    private static void search(int[] array, int item) {
        int index = -1;

        // Search for the item in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                index = i;
                break;
            }
        }

        // If the item is not found
        if (index == -1) {
            System.out.println("Item not found in the array.");
            return;
        }

        // Print right neighbors
        if (index + 1 < array.length) {
            System.out.println("Right Neighbors: " + array[index + 1]);
            if (index + 2 < array.length) {
                System.out.println(array[index + 2]);
            } else {
                System.out.println("No right neighbor");
            }
        } else {
            System.out.println("No right neighbor");
        }

        // Print left neighbors
        if (index - 1 >= 0) {
            System.out.println("Left Neighbors: " + array[index - 1]);
            if (index - 2 >= 0) {
                System.out.println(array[index - 2]);
            } else {
                System.out.println("No left neighbor");
            }
        } else {
            System.out.println("No left neighbor");
        }
    }
}
