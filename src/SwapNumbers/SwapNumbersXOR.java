/**
 * Program: SwapNumbers
 * Description: Swaps two numbers without using a temporary variable.
 * Approach: Uses XOR operation to swap values.
 * Time Complexity: O(1) (constant time).
 * Space Complexity: O(1) (no extra space used).
 * Edge Cases: No risk of integer overflow.
 */

package SwapNumbers;
public class SwapNumbersXOR {
    public static void main(String[] args) {
        var a = 5;
        var b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swapNumbers(a, b);
    }

    /**
     * Swaps two numbers using XOR operation.
     * @param a The first number.
     * @param b The second number.
     */
    public static void swapNumbers(int a, int b) {
        // Swap using XOR
        a = a ^ b; // a now holds a XOR b
        b = a ^ b; // b now holds the original a
        a = a ^ b; // a now holds the original b

        // Print swapped values
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}