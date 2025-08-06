/*
4.4. Palindrome Check (Ignoring Case & Non-Alphanumeric Characters): Implement a function to check if a string is a palindrome.
 */

import java.util.regex.*;

class Mains4_4 {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // true
        System.out.println(isPalindrome("No lemon, no melon")); // true
        System.out.println(isPalindrome("Hello, World!")); // false
    }
}

