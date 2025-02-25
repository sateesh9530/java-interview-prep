package ArmstrongNumber;

/**
 * Program: ArmstrongNumber
 * Description: Checks if a number is an Armstrong number (sum of its own digits each raised to the power of the number of digits).
 * Approach: Uses integer arithmetic to avoid floating-point inaccuracies and handles negative numbers.
 * Time Complexity: O(d), where d is the number of digits.
 * Space Complexity: O(1) (constant space).
 * Edge Cases: Handles negative numbers, zero, and potential integer overflow by using long for sum.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int[] testNumbers = {153, 9474, 0, 1, 370, -123, 123};

        for (int num : testNumbers) {
            System.out.println(num + " is Armstrong? " + isArmstrong(num));
        }
    }

    /**
     * Checks if a number is an Armstrong number.
     * @param number The number to check.
     * @return true if the number is Armstrong, false otherwise.
     */
    public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false; // Armstrong numbers are defined for non-negative integers
        }

        int original = number;
        int digits = String.valueOf(original).length();
        long sum = 0; // Use long to prevent overflow

        int temp = original;
        while (temp > 0) {
            int digit = temp % 10;
            long power = 1;

            // Calculate digit^digits using integer multiplication
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        return sum == original;
    }
}