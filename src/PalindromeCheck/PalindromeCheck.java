package PalindromeCheck;

/**
 * Program: Palindrome check
 * Description: Checks if a string or number is a palindrome.
 * Approach: Uses a two-pointer technique to compare characters from both ends.
 * Time Complexity: O(1) (no extra space used).
 * Edge cases: Handles empty strings, single characters, and negative numbers
 */

public class PalindromeCheck {
    public static void main(String[] args) {
        // Test strings
        String str1 = "madam";
        String str2 = "hello";
        // Test numbers (Converted to strings)
        int num1 = 12321;
        int num2 = -121;
        System.out.println("Is '" + str1 + "' a palindrome? " + isPalindrome(str1));
        System.out.println("Is '" + str2 + "' a palindrome? " + isPalindrome(str2));
        System.out.println("Is " + num1 + " a palindrome? " + isPalindrome(String.valueOf(num1)));
        System.out.println("Is " + num2 + " a palindrome? " + isPalindrome(String.valueOf(num2)));
    }
    /**
     * check if a string is a palindrome
     * @param input The string to check.
     * @return true if the string is a palindrome, false. otherwise.
     */
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        // Compare characters from both ends
        while(left < right) {
            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
