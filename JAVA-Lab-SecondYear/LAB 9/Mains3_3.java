/*
3.3. Find Longest Repeating Substring: 
Write a program to find the longest repeating substring in a string.
 */

class Mains3_3 {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(longest(str));
    }

    public static String longest(String str) {
        int n = str.length();
        String lngst= "";
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                String sub = str.substring(i, i + len);
                if (str.indexOf(sub, i + 1) != -1 && sub.length() > lngst.length()) {
                    lngst = sub;
                }
            }
        }
        
        return lngst;
    }
}
