package String;

import java.util.ArrayList;
import java.util.List;

/**
 * program: FindAnagrams
 * Description: Find all start indices of p's anagrams in s using a sliding window approach.
 * Approach: Uses a character count array to track frequencies and a sliding window to compare substrings.
 * Time Complexity: O(n), where n is the length of s.
 * Space Complexity: O(1) (fixed-size character count array).
 * Edge cases: Handles empty strings, p longer than s, and overlapping anagrams.
 */
public class FindAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = findAnagrams(s, p);
        System.out.println(result); // Output: [0, 6]
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length() == 0 || p.length()>s.length()) {
            return result;
        }
        int[] charCount = new int[26];
        for(char c : p.toCharArray()) {
            charCount[c - 'a']++; // Initialize character counts for p
        }
        int start = 0, end = 0, count = p.length();
        while(end < s.length()) {
            // Expand the window: decrement count for the current character
            if(charCount[s.charAt(end++) - 'a']-- >= 1) {
                count--;
            }
            // If count == 0, the current window is an anagram.
            if (count == 0) {
                result.add(start);
            }
            // Contract the window: increment count for the character at start.
            if(end - start == p.length() && charCount[s.charAt(start++)- 'a']++ >= 0) {
                count++;
            }
        }
        return result;
    }
}
