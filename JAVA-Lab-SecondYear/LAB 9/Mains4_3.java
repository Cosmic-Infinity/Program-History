/*
4.3. Find & Replace Words: Implement a function that replaces every occurrence of a word in a string using regex.
 */

import java.util.regex.*;

class Mains4_3 {
    public static void main(String[] args) {
        String original = "The cat sat on the mat. The cat is happy.";
        String word = "cat";
        String replacewith = "dog";
        String result = replaceWord(original, word, replacewith);

        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + result);
    }

    public static String replaceWord(String str, String word, String replacement) {
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll(Matcher.quoteReplacement(replacement));
    }
}
