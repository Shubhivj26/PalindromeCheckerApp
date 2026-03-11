import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into queue and stack
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);      // enqueue
            stack.push(ch);     // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}