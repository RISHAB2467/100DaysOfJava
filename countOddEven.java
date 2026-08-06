import java.util.*;

public class CountOddEven {

    public static int[] countOddEven(int[] arr) {

        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[]{odd, even};
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

        int[] ans = countOddEven(arr);

        System.out.println("Odd Count = " + ans[0]);
        System.out.println("Even Count = " + ans[1]);

        sc.close();
    }
}