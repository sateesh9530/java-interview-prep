package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Program: IterateHashMap
 * Description: Demonstrates how to iterate over a HashMap using an enhanced for-loop and a while-loop with an iterator
 * Approach: Uses 'Map.Entry' to access key-value pairs and iterates using both loops.
 * Time Complexity: O(n), where n is the number of entries in the HashMap.
 * Space Complexity: O(1) (no additional space used for iteration).
 */
public class IterateHashMap {
    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Sateesh");
        map.put("Age", "29");
        map.put("City", "Yanam");

        // Iterate using enhanced for-loop
        System.out.println("Iterating using enhanced for-loop: ");
        iterateHashMapWithForLoop(map);

        // Iterate using while-loop with iterator
        System.out.println("\n Iterate using while-loop with iterator: ");
        iterateHashMapWithWhileLoop(map);
    }

    /**
     * Iterates over a HashMap using an enhanced for-loop.
     * @param map The HashMap to iterate over.
     */
    public static void iterateHashMapWithForLoop(Map<String, String> map) {
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    /**
     * Iterates over a HashMap using a while-loop with an iterator.
     * @param map The HashMap to iterate over.
     */
    public static void iterateHashMapWithWhileLoop(Map<String, String> map) {
        Iterator <Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
