/*
3.1 Find All Substrings: Given a string, generate all possible substrings.
 */

class Mains3_1 {
    public static void main(String[] args) {
        generateSubstrings("can");
    }

    public static void generateSubstrings(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
 