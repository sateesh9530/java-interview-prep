/**
 * Program: SwapNumbers
 * Description: Swaps two numbers without using a temporary variable.
 * Approach: Uses arithmetic operations (addition and subtraction) to swap values.
 * Time Complexity: O(1) (constant time).
 * Space Complexity: O(1) (no extra space used).
 * Edge Cases: Handles integer overflow (though this approach is not recommended for large numbers).
 */
package SwapNumbers;

public class SwapNumbersArithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swapNumbers(a, b);
    }
    /**
     * Swaps two numbers without using a temporary variable.
     * @param a The first number.
     * @param b The second number.
     */
    public static void swapNumbers(int a, int b) {
        // Swap using arithmetic operations
        a = a + b; // a now holds the sum of a and b.
        b = a - b; // b now holds the original value.
        a = a - b; // a now holds the original value of b

        // Print swapped values
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
