package labs.java.lab5;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String lower = word.toLowerCase();
        return new StringBuilder(lower).reverse().toString().equals(lower);
    }
}
