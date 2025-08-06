/*
6.1. Custom trim() Implementation: Remove leading and trailing spaces from a string without using trim(). */

class Main6_1 {
    public static String customTrim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String example = "   Hello, World!   ";
        System.out.println("[" + customTrim(example) + "]");
    }
}

