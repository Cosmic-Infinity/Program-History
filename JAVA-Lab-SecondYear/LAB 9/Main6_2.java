/*
6.2. Find the Most Frequent Character: Given a string, find the most frequently occurring character.*/

class Main6_2 {
    public static char mostFrequentChar(String str) {
        int[] freq = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int maxCount = -1;
        char mostFrequent = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                mostFrequent = c;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String example = "sample string example";
        System.out.println("Most Frequent Character: " + mostFrequentChar(example));
    }
}

