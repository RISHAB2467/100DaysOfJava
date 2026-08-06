import java.util.*;

public class MinMaxArray {

    public static ArrayList<Integer> getMinMax(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        if (arr.length == 0) {
            return result;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        result.add(min);
        result.add(max);

        return result;
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

        ArrayList<Integer> ans = getMinMax(arr);

        System.out.println("Minimum = " + ans.get(0));
        System.out.println("Maximum = " + ans.get(1));

        sc.close();
    }
}