package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Program: DuplicateCharacters
 * Description: Finds and prints duplicate characters in string along with their occurrence count.
 * Approach: Uses a HashMap to count character occurrences and identifies duplicates.
 * Time Complexity: O(n), where n is the length of the input string
 * Space Complexity: O(k), where k is the number of unique characters in the string.
 * Edge cases: Handles empty string, case sensitivity and non-alphabetic characters.
 */

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "Hello world!";
        System.out.println("Input: " + input);
        findDuplicates(input);
    }
    /**
     * Find and prints duplicate characters in the input string.
     * @param input The string to analyze for duplicate characters.
     */
    public static void findDuplicates(String input) {
        // Create a HashMap to store characters count.
        Map<Character, Integer> charCount = new HashMap<>();

        // Convert the string to character array
        char[] characters = input.toCharArray();

        // Count occurrences of each character.
        for (char c : characters) {
            // Update the count in the HashMap
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Print characters with count > 1 (duplicates)
        System.out.println("Duplicate characters: ");
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if(entry.getValue() > 1 ) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}
