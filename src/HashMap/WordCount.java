package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Program: WordCount
 * Description: Count the number of occurrences of each word in a string using a HashMap.
 * Approach: Split the input string into words and uses a HashMap to store word counts.
 * Time Complexity: O(n), where n is the number of words in the input string.
 * Space Complexity: O(m), where m is the number of unique words in the input String.
 * Edge cases: Handles empty strings and multiple spaces between words.
 */
public class WordCount {
    public static void main(String[] args) {
        String input = "Hello world! Hello every one. This is a test. Hello world!";
        Map<String, Integer> wordCount = countWords(input);

        // Print word count
        System.out.println("Word counts: ");
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    /**
     * Counts the occurrences of each word in the input string
     * @param input The input string to process.
     * @return A HashMap containing words as key and their counts as values.
     */
    public static Map<String, Integer> countWords(String input) {
        // Create a HashMap to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        // Split the input string into words using whitespaces as the delimiter
        String[] words = input.split("\\s+");

        // Count occurrences of each word
        for (String word: words) {
            // Remove punctuation and convert to lowercase (optional)
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Skip empty strings (if any)
            if(!word.isEmpty()) {
                // Update the word count in the HashMap
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
}
