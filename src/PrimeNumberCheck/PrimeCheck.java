package PrimeNumberCheck;
/**
 * Program: PrimeCheck
 * Description: Checks if a number is prime using an optimized algorithm.
 * Approach: Uses mathematical optimizations like checking up to √n and testing divisors of the form 6k ± 1.
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 * Edge Cases: Handles numbers ≤1, 2, 3, and even numbers.
 */
public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29; // Example input
        boolean isPrime = isPrime(number);
        System.out.println(number + " is prime? " + isPrime);
    }
    /**
     * Check if a number is prime efficiently.
     * @param num The number to check.
     * @return true if prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) return false;
        if (num <=3) return true; // 2 and 3 are primes

        // Eliminate multiples of 2 and 3
        if(num % 2 == 0 || num % 3 == 0) return false;

        // Check divisors of the form 6k += 1 up to Root (num)
        for (int i = 5; i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
