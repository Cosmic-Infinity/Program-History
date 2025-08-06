/*
3.4. Substring Count: Count occurrences of a given substring within a string (e.g., "ababc" contains "ab" twice).
 */

class Mains3_4 {
    public static void main(String[] args) {
        String str = "ababc";
        String sub = "ab";
        System.out.println("Occurrences of '" + sub + "': " + occurrence(str, sub));
    }

    public static int occurrence(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}

