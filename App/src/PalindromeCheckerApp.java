public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String word = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        // Two pointer comparison
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }
}