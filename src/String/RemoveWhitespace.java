package String;
/**
 * Program: RemoveWhitespace
 * Description: Removes all whitespace characters (spaces, tabs, newlines, etc.) from a string.
 * Approach: Iterates through each character and appends non-whitespace characters to a StringBuilder.
 * Time Complexity: O(n), where n is the length of the input string.
 * Space Complexity: O(n) (for the resulting string).
 * Edge Cases: Handles empty strings, strings with all whitespace, and null input.
 */
public class RemoveWhitespace {
    public static void main(String[] args) {
        String input = " Java \t is \n awesome!  ";
        String result = removeWhitespace(input);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Result: \"" + result + "\"");
    }

    /**
     * Removes all whitespace characters from the input string.
     * @param input The string to process.
     * @return A new string with all whitespace removed.
     */
    public static String removeWhitespace(String input) {
        if (input == null) {
            return null; // Handle null input if required
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isWhitespace(c)) { // Checks for any whitespace character
                result.append(c);
            }
        }
        return result.toString();
    }
}