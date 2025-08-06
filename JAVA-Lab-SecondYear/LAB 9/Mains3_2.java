/*
3.2. Longest Common Substring: Find the longest common substring between two strings using dynamic programming.
 */

class Mains3_2 {
    public static void main(String[] args) {
        String str1 = "abcdxyz";
        String str2 = "xyzabcd";
        System.out.println(common(str1, str2));
    }

    public static String common(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0;
        int endIndex = -1;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        if (maxLength == 0) {
            return "";
        } else {
            return str1.substring(endIndex - maxLength + 1, endIndex + 1);
        }
    }
}