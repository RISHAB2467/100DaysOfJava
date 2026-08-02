public class largestelement {

    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};

        int largest = largestElement(nums);

        System.out.println("Largest Element: " + largest);
    }

    public static int largestElement(int[] nums) {
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;
    }
}