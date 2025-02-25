package ArrayList.Iterate;

import java.util.ArrayList;
import java.util.List;

/**
 * Program: IterateArrayList
 * Description: Demonstrates three ways to iterate through an ArrayList:
 *              1. Traditional for-loop
 *              2. While-loop
 *              3. Enhanced for-loop
 * Time Complexity: O(n) for all approaches.
 * Space Complexity: O(1) (no extra space used).
 */
public class IterateArrayList {
    public static void main(String[] args) {
        // Create and populate an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Iterate using all three methods
        iterateList(numbers);
    }
    /**
     * Iterates through a list using three different loop types.
     * @param list The list type of integers to iterate over.
     */
    public static void iterateList(List<Integer> list) {
        System.out.println("Using traditional for-loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\n Using while-loop:");
        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }
        System.out.println("\n Using enhanced for-loop: ");
        for(int item : list) {
            System.out.println(item);
        }
    }
}
