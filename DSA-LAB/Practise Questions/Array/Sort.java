
public class SelectionSort {

    // Function to perform Selection Sort
    static void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;

            // Swap the found minimum element with the first element
            swap(arr, minIdx, i);
        }
    }

    // Function to swap two elements in an array
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print an array
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {0, 23, 14, 12, 9};
        int n = arr.length;

        System.out.println("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSorted array in Ascending order: ");
        printArray(arr);
    }
}
