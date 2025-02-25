package String;

/**
 * Program: RemoveSpaces
 * Description: Remove all space characters(' ') from a string without using replace().
 * Approach: Iterates through each character and appends non-space characters to a StringBuilder.
 * Time Complexity: O(n), where n is the length of a StringBuilder.
 * Space Complexity: O(n) (for the resulting string).
 * Edge Cases: Handles empty strings and strings with all spaces.
 */

public class RemoveSpaces {
    public static void main(String[] args) {
        String input = "Java   is   awesome!";
        String result = removeWhitespaces(input);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Result: \"" + result + "\"");
    }
    /**
     * Remove all space characters(' ') from the input String.
     * @param input The String to process.
     * @return A new String with all spaces removed.
     */
    public static String removeWhitespaces(String input) {
        if (input == null) {
            return null; // Handle null input if required
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c != ' ') { // checks for space character (UT0020)
                result.append(c);
            }
        }
        return result.toString();
    }

}
