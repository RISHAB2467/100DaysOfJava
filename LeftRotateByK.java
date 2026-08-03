import java.util.*;

public class LeftRotateByK {

    public static void leftRotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        for (int r = 0; r < k; r++) {

            int temp = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = temp;
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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        leftRotate(arr, k);

        System.out.println("Array after Left Rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}