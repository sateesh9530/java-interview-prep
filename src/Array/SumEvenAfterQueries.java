package Array;
/**
 * Program: SumEvenAfterQueries
 * Description: Processes queries to add values to specific indices and returns the sum of even numbers after each query.
 * Approach: Tracks the sum of even numbers incrementally using efficient updates.
 * Time Complexity: O(n + q), where n is the length of nums and q is the number of queries.
 * Space Complexity: O(1) additional space (excluding input and output storage).
 * Edge Cases: Handles even to odd transitions, odd to even transitions, and zero values.
 */
public class SumEvenAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] result = sumEvenAfterQueries(nums, queries);
        System.out.println(java.util.Arrays.toString(result)); // Output: [8, 6, 2, 4]
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sumEven = 0;
        // Calculate initial sum of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            int original = nums[index];
            // Remove the original value from sum if it was even
            if (original % 2 == 0) {
                sumEven -= original;
            }
            // Update the value at the index
            nums[index] += val;
            int newValue = nums[index];
            // Add the new value to sum if it is even
            if (newValue % 2 == 0) {
                sumEven += newValue;
            }
            result[i] = sumEven;
        }
        return result;
    }
}
