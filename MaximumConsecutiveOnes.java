import java.util.*;

/*
Question: Maximum Consecutive Ones
Topic: Arrays

Logic:
1. Traverse the array.
2. If the current element is 1, increase count.
3. Update max if current count is greater.
4. If the current element is 0, reset count to 0.
5. Return the maximum consecutive count.
*/

public class MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter binary array (0s and 1s):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = findMaxConsecutiveOnes(nums);

        System.out.println("Maximum Consecutive Ones = " + ans);

        sc.close();
    }
}