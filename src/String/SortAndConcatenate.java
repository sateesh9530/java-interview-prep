package String;

import java.util.Arrays;

/**
 * Program: SortAndConcatenate.
 * Description: Accepts comma-separated strings, sorts them in ascending order, and outputs the concatenated result.
 * Approach: Splits the input by commas, sorts the array lexicographically, and joins the sorted strings.
 * Time Complexity: O(n log n) (due to sorting), where n is the number of strings.
 * Space Complexity: O(n) (for sorting the split array).
 * Edge Cases: Handles empty input, single-element input, and duplicate strings.
 */

public class SortAndConcatenate {
    public static void main(String[] args) {
        String input1 = "banana,apple,orange";
        String input2 = "z,a,b";
        String input3 = "hello";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + sortAndConcatenate(input1));

        System.out.println("\n Input: " + input2);
        System.out.println("output: " + sortAndConcatenate(input2));

        System.out.println("\nInput: " + input3);
        System.out.println("Output: " + sortAndConcatenate(input3));
    }
    /**
     * Sorts comma-separated strings and return the concatenation result.
     * @param input The comma-separated input string.
     * @return The concatenated string of sorted elements.
     */
    public static String sortAndConcatenate(String input) {
        // Split the input string by commas
        String[] parts = input.split(",");

        // Sort the array lexicographically
        Arrays.sort(parts);

        // Join the sorted strings into a single string
        return String.join("", parts);
    }

}
