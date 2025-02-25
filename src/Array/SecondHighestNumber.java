package Array;

/**
 * Program: SecondHighestNumber
 * Description: Finds the second-highest number in an array with edge case handling.
 * Approach: Uses two variables to track the highest and second-highest numbers in a single pass
 * Time Complexity: O(n), where n is the length of the array.
 * Space Complexity: O(1) (Constant space)
 * Edge cases: Handles empty arrays, single-element arrays, and arrays with all identical elements.
 */

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] nums1 = {5, 3, 7, 9, 2, 9}; // Example with duplicates
        int[] nums2 = {5, 5}; // All elements identical.
        int[] nums3 = {4}; // Single-element array

        try{
            System.out.println("Second highest in nums1: " + secondHighest(nums1));
            System.out.println("Second highest in nums2: " + secondHighest(nums2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try{
            System.out.println("Second highest in nums3: " + secondHighest(nums3));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Finds the secomnd-highest number in an array.
     * @param nums The input array of integers.
     * @return The second-highest number.
     * @throws IllegalArgumentException if the array has fewer than 2 elements or all elements are identical
     */
    public static int secondHighest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        // Check if all elements are the same
        if (secondHighest == Integer.MIN_VALUE) {
            boolean allSame = true;
            for (int num : nums) {
                if (num != highest) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                throw new IllegalArgumentException("All elements are identical.");
            }
        }
        return secondHighest;
    }
}
