package FibonacciSeries.Recursion;

/**
 * Program: FibonacciRecursion
 * Description: Computes the nth Fibonacci number using recursion.
 * Approach: Uses the mathematical definition of Fibonacci sequence with base cases for n=0 and n=1.
 * TimeComplexity: O(2^n) (exponential time due to redundant calculations).
 * Space Complexity: O(n) (Stack space for recursion).
 * Edge Cases: Handles n=0, n=1, and invalid inputs (n<0).
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
    /**
     * Computes the nth Fibonacci number recursively.
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     * @throw IllegalArgumentException if n is negative.
     */
    public static int fibonacci(int n) {
        // Handle invalid input
        if(n < 0) {
            throw new IllegalArgumentException("n must be non-negative.");
        }
        // Base cases: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
