/*
6.5. Custom Implementation of indexOf(): Implement a function similar to String.indexOf() that finds the first occurrence of a character or substring.
 */
class Main6_5 {
    public static int indexOf(String str, String sub) {
        if (sub.length() == 0) return 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) break;
            }
            if (j == sub.length()) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String sub = "World";
        System.out.println("Index of substring: " + indexOf(str, sub)); // Output: 7
    }
}
