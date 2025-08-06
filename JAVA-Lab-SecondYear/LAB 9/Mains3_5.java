/*
3.5. Implement a Custom split(): Write a method that splits a sing based on a given d without using sing.split(). */

class Mains3_5 {
    public static void main(String[] args) {
        String s = "apple,banana,grape,orange";
        String d = ",";
        String[] result = Split(s, d);

        for (String s1 : result) {
            System.out.println(s1);
        }
    }

    public static String[] Split(String s, String d) {
        int count = 1 + (s.length() - s.replace(d,"").length());
        String[] result = new String[count];
        int start = 0;
        int index = 0;
        for (int i = 0; i < s.length() - d.length() + 1; i++) {
            if (s.substring(i, i + d.length()).equals(d)) {
                result[index] = s.substring(start, i);
                start = i + d.length();
                index++;
            }
        }
        result[index] = s.substring(start);
        return result;
    }
}