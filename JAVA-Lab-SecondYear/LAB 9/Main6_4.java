/*
6.4. Compress a String (Run-Length Encoding): Implement basic string compression using the counts of repeated characters.
· Input: "aaabbcdd"
· Output: "a3b2c1d2" 
 */
class Main6_4 {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbcdd";
        System.out.println("Compressed String: " + compress(input)); // Output: "a3b2c1d2"
    }
}
