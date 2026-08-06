import java.util.*;

public class ReverseArray {

    public static void reverseArray(int[] arr) {

        int j = arr.length - 1;

        for (int i = 0; i < j; i++) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}