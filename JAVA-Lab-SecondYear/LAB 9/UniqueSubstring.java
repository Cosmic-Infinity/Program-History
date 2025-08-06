import java.util.*;

public class UniqueSubstring {
    public static String find(String s) {
        int n = s.length();
        int start = 0, maxStart = 0, maxLen = 0;
        int[] lastIndex = new int[128];
        Arrays.fill(lastIndex, -1);

        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            start = Math.max(start, lastIndex[c] + 1);
            lastIndex[c] = end;
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }
        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(find("abcabcbb"));
        System.out.println(find("bbbbb"));
        System.out.println(find("pwwkew"));
    }
}