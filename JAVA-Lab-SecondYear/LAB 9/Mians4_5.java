/*
4.5 Check if Two Strings are Anagrams: Verify if two strings are anagrams of each other.
 */

import java.util.regex.*;

class Mians4_5 {
    public static boolean areAnagrams(String str1, String str2) {
        String cleaned1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String cleaned2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (cleaned1.length() != cleaned2.length()) return false;
        char[] arr1 = cleaned1.toCharArray();
        char[] arr2 = cleaned2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Listen", "Silent")); // true
        System.out.println(areAnagrams("Anagram", "Nagaram")); // true
        System.out.println(areAnagrams("Hello", "World")); // false
    }
}

