package String;
/**
 * Program: LongestSubstring
 * Description: Finds the length of the longest substring without repeating characters using a sliding window approach.
 * Approach: Uses a frequency array to track character occurrences and adjust the window dynamically.
 * Time Complexity: O(n), where n is the length of the string.
 * Space Complexity: O(1) (fixed-size array for ASCII characters).
 * Edge Cases: Handles empty strings, all unique characters, and all repeating characters.
 */
public class LongestSubstring {
    public static void main(String[] args) {
        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
        String s5 = "abcdef";

        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: " + lengthOfLongestSubstring(s1)); // Expected: 3

        System.out.println("\nInput: \"" + s2 + "\"");
        System.out.println("Output: " + lengthOfLongestSubstring(s2)); // Expected: 1

        System.out.println("\nInput: \"" + s3 + "\"");
        System.out.println("Output: " + lengthOfLongestSubstring(s3)); // Expected: 3

        System.out.println("\nInput: \"" + s4 + "\"");
        System.out.println("Output: " + lengthOfLongestSubstring(s4)); // Expected: 0

        System.out.println("\nInput: \"" + s5 + "\"");
        System.out.println("Output: " + lengthOfLongestSubstring(s5)); // Expected: 6
    }

    /**
     * Calculates the length of the longest substring without repeating characters.
     * @param s The input string.
     * @return The length of the longest unique substring.
     */
    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128]; // ASCII characters (0-127)
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            chars[currentChar]++; // Increment frequency of current character

            // If duplicate found, contract the window by moving left pointer
            while (chars[currentChar] > 1) {
                char leftChar = s.charAt(left);
                chars[leftChar]--; // Decrement frequency of left character
                left++; // Shrink the window
            }

            // Update the maximum length after adjusting the window
            maxLength = Math.max(maxLength, right - left + 1);
            right++; // Expand the window
        }
        return maxLength;
    }
}
