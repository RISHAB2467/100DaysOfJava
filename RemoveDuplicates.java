import java.util.*;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int unique = removeDuplicates(nums);

        System.out.println("Number of Unique Elements = " + unique);

        System.out.print("Modified Array: ");

        for (int i = 0; i < unique; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}