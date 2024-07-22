package Question1;
public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 7, 6, 9, 10};
        
        SEG(arr);

        System.out.println("Output :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void SEG(int[] arr) {
        int L = 0, R = arr.length - 1;

        while (L < R) {
            
            while (arr[L] % 2 == 0 && L < R) {
                L++;
            }

            while (arr[R] % 2 == 1 && L < R) {
                R--;
            }
            if (L < R) {
                int temp = arr[L];
                arr[L] = arr[R];
                arr[R] = temp;
                L++;
                R--;
            }
        }
    }
}
