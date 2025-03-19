import java.util.*;

public class FirstNonRepeatingChar {
    public static char firstNonRepeatingCharacter(String s) {
        Queue<Character> queue = new LinkedList<>();
        Map<Character, Integer> charCount = new HashMap<>();

        // Step 1: Traverse the string
        for (char c : s.toCharArray()) {
            queue.offer(c); // Add character to queue
            charCount.put(c, charCount.getOrDefault(c, 0) + 1); // Update frequency
            
            // Step 2: Remove repeating characters from the front of the queue
            while (!queue.isEmpty() && charCount.get(queue.peek()) > 1) {
                queue.poll(); // Remove repeating character
            }
        }

        // Step 3: If queue is empty, return -1 (all characters are repeating)
        return queue.isEmpty() ? '-1' : queue.peek();
    }

    public static void main(String[] args) {
        String input1 = "aabbccddeffg"; // First non-repeating: 'g'
        String input2 = "abcabc";       // All repeating: -1
        String input3 = "leetcode";     // First non-repeating: 'l'

        System.out.println("First Non-Repeating: " + firstNonRepeatingCharacter(input1)); // Output: g
        System.out.println("First Non-Repeating: " + firstNonRepeatingCharacter(input2)); // Output: -1
        System.out.println("First Non-Repeating: " + firstNonRepeatingCharacter(input3)); // Output: l
    }
}
