/*
4.2. Extract Numbers from a String: Extract all numbers from "abc123def456" and return [123, 456].
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Mains4_2 {
    public static void main(String[] args) {
        String str = "abc123def456";
        String[] numbers = extract(str);

        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public static String[] extract(String str) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        StringBuilder numbers = new StringBuilder();

        while (matcher.find()) {
            numbers.append(matcher.group());
            numbers.append(",");
        }

        return numbers.toString().split(",");
    }
}