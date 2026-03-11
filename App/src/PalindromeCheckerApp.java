
public class PalindromeCheckerApp {
public class UseCase3PalindromeCheckerApp {


    public static void main(String[] args) {

        String word = "madam";

        char[] characters = word.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");

        String original = "level";
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");

        }
    }
}