package String;

/**
 * Program: GoodStringChecker.
 * Description: Determines if all characters in a string have the same frequency of occurrences.
 * Approach: Uses an array to count characters frequencies and checks if all non-zero counts are equal.
 * Time complexity: O(n), where n is the length of the string.
 * Space complexity: O(1) (fixed-size array for lowercase letters).
 * Edge Cases: Handles empty strings, single character strings, and assumes input is lowercase letters.
 * Assumption: Input string contains only lowercase English letters(a-z)
 */
public class GoodStringChecker {
    public static void main(String[] args) {
        String s1 = "abab"; // Frequencies: 2, 2 -> good.
        String s2 = "aaabbb"; // Frequencies: 3, 5 -> good.
        String s3 = "aab"; // Frequencies: 2, 1 -> bad.
        String s4 = ""; // No characters -> Considered good.

        System.out.println(s1 + "is good? " + areOccurrencesEqual(s1)); // True
        System.out.println(s2 + "is good? " + areOccurrencesEqual(s2)); // True
        System.out.println(s3 + "is good? " + areOccurrencesEqual(s3)); // False
        System.out.println(s4 + "is good? " + areOccurrencesEqual(s4)); // True
    }
    /**
     * Checks if all characters in the string have the same frequency.
     * @param s The input string (assumed to contain only lowercase letters).
     * @return true if all characters have the same frequency, false otherwise.
     */
    public static boolean areOccurrencesEqual(String s) {
        int[] count = new int[26]; // Counts for 'a-z'
        for(char c:s.toCharArray()) {
            count[c - 'a']++; // Substract 'a' to map 'a' - 'z' to 0-25
        }
        int frequency = 0;
        for (int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                if(frequency == 0) {
                    frequency = count[i]; // Set the first non-zero frequency
                } else if (count[i] != frequency) {
                    return false; // Mismatched frequency found
                }
            }
        }
        return true;
    }
}
