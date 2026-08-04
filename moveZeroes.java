import java.util.*;

/*
Question: Move Zeroes
Topic: Arrays (Two Pointers)

Logic:
1. 'j' stores the position where the next non-zero element should go.
2. Traverse the array using 'i'.
3. Whenever a non-zero element is found, swap it with nums[j].
4. Increment j.
5. All zeroes automatically move to the end.
*/

public class moveZeroes {

    public static void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.println("Array after moving zeroes:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}