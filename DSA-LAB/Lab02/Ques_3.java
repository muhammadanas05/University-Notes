a) Let A be an array of size n≥2 containing integers from 1 to n−1 inclusive, one of which is
repeated. Write a program for finding the integer in A that is repeated.
b) Let B be an array of size n≥6 containing integers from 1 to n−5 inclusive, five of which are
repeated. Write a program for finding the five integers in B that are repeated.



public class FindRepeatedElements {

    public static void main(String[] args) {
        // Part a) Find repeated integer in array A
        int[] arrayA = {1, 2, 3, 4, 5, 3}; // Example array A
        int repeatedA = findRepeatedElement(arrayA);
        System.out.println("Repeated element in array A: " + repeatedA);

        // Part b) Find five repeated integers in array B
        int[] arrayB = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 4, 10, 11, 12, 13, 5, 14, 15}; // Example array B
        int[] repeatedB = findRepeatedElements(arrayB);
        System.out.print("Repeated elements in array B: ");
        for (int element : repeatedB) {
            System.out.print(element + " ");
        }
    }

    // Function to find the repeated element in array A
    private static int findRepeatedElement(int[] array) {
        int n = array.length;
        int repeatedElement = -1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(array[i]) - 1;

            // Mark visited elements by making them negative
            if (array[index] > 0) {
                array[index] = -array[index];
            } else {
                repeatedElement = Math.abs(array[i]);
                break;
            }
        }

        return repeatedElement;
    }

    // Function to find five repeated elements in array B
    private static int[] findRepeatedElements(int[] array) {
        int n = array.length;
        int[] repeatedElements = new int[5];

        for (int i = 0; i < n; i++) {
            int index = Math.abs(array[i]) - 1;

            // Mark visited elements by making them negative
            if (array[index] > 0) {
                array[index] = -array[index];
            } else {
                // Store repeated elements
                for (int j = 0; j < 5; j++) {
                    if (repeatedElements[j] == 0) {
                        repeatedElements[j] = Math.abs(array[i]);
                        break;
                    }
                }
            }
        }

        return repeatedElements;
    }
}
