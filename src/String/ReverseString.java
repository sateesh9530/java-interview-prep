/**
 * Program: ReverseString
 * Description: Reverses a given string without using built-in methods like StringBuilder.reverse().
 * Approach: Uses a two-pointer technique to swap characters from the start and end of the string.
 * Time Complexity: O(n) (linear time, where n is the length of the string).
 * Space Complexity: O(n) (char array to store the string).
 * Edge Cases: Handles null input and empty strings.
 */
package String;

public class ReverseString {
    public static void main(String[] args) {
        // Example input
        String input = "Hello World!";
        // Reverse the string
        String reversed = reverseString(input);
        // Print original and reversed strings
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    /**
     * Reverses a string using a two-pointer technique.
     * @param input The string to be reversed.
     * @return The reversed string, or null if input is null.
     */
    public static String reverseString(String input) {
        // Handle null input
        if (input == null) return null;

        // Convert string to mutable char array
        char[] chars = input.toCharArray();
        int left = 0;                  // Pointer starting from the beginning
        int right = chars.length - 1;  // Pointer starting from the end

        // Swap characters until pointers meet in the middle
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;   // Move left pointer forward
            right--;  // Move right pointer backward
        }

        // Convert char array back to string
        return new String(chars);
    }
}