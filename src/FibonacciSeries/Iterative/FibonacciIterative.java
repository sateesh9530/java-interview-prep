package FibonacciSeries.Iterative;
/**
 * Program: FibonacciIterative
 * Description: Computes the nth Fibonacci number using an iterative approach.
 * Approach: Uses a loop to compute Fibonacci numbers efficiently.
 * Time Complexity: O(n) (linear time).
 * Space Complexity: O(1) (constant space).
 * Edge Cases: Handles n=0, n=1, and invalid inputs (n < 0).
 */
public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Example input

        // Compute Fibonacci using iterative approach
        System.out.println("Fibonacci(" + n + ") using iterative approach: " + fibonacciIterative(n));
    }

    /**
     * Computes the nth Fibonacci number iteratively.
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     * @throws IllegalArgumentException if n is negative.
     */
    public static int fibonacciIterative(int n) {
        // Handles invalid input
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative.");
        }

        // Base case: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }

        // Initialize variables to store previous two Fibonacci numbers
        int prev = 0;
        int current = 1;

        // Compute fibonacci numbers iteratively
        for (int i = 2; i <=n; i++) {
            int next = prev + current; // Compute next fibonacci number
            prev = current; // Update prev to current
            current = next; // Update current to next
        }
        return current;
    }
}
