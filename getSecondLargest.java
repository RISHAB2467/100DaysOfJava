
public class getSecondLargest {

    public static int getSecondLargest(int[] a) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }

        return (max2 == Integer.MIN_VALUE) ? -1 : max2;
    }

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println(getSecondLargest(arr));
    }
}