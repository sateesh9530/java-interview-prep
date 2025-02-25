package TwoSumProblem;

import java.util.HashMap;
import java.util.Map;

/**
 * Program: TwoSum
 * Description: Finds two numbers in an array that add up to a target and returns their indices.
 * Approach: Uses a HashMap to track complements (target - nums[i]) for O(n) time complexity.
 * Time Complexity: O(n) (for storing elements and their indices in the HashMap).
 * Space Complexity: O(n) (for storing elements and their indices in the HashMap).
 * Edge Cases: Handles duplicate values, negative numbers, and ensure no element is used twice.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
    /**
     * Finds the indices of two numbers that add up to the target.
     * @param nums The input array of integers.
     * @param target The target sum.
     * @return An array of two indices.
     * @throws IllegalArgumentException if no valid pair exists.
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i); // Add current number to the map after checking.
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
