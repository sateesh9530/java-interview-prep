package Array;

/**
 * Program: RemoveElement
 * Description: Removes all instances of a value from an array in-place and returns the new length.
 * Approach: Uses a two pointer technique to overwrite elements not equal to the target value.
 * Time Complexity: O(n) (in-place modification with no extra memory).
 * Edge Cases: Handles empty arrays, arrays with all elements equal to val at the end.
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int newLength1 = removeElement(nums1, val1);
        System.out.println("New Length (num1): " + newLength1); // Output: 2
        printArray(nums1, newLength1); // Output: [2, 2]

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int newLength2 = removeElement(nums2, val2);
        System.out.println("\n New length (nums2): " + newLength2); // Output: 5
        printArray(nums2, newLength2); // Output: [0, 1, 3, 0, 4]
    }
    /**
     * Removes all instances of val from nums in-palce and returns the new length.
     * @param nums The input array.
     * @param val The value to remove.
     * @return The new length of the array after removal.
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0; // Slow pointer: Tracks the position to Overwrite.
        for (int j=0; j<nums.length; j++) { //Fast pointer: scans all elements
            if (nums[j] != val) {
                nums[i] = nums[j]; // Overwrite nums[i] with nums[j] if valid.
                i++; // Move slow pointer forward
            }
        }
        return i;
    }
    /**
     * Prints the first elements of the array.
     * @param nums The array to print.
     * @param k The number of elements to print.
     */
    private static void printArray(int[] nums, int k) {
        System.out.print("[");
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if(i < k -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
