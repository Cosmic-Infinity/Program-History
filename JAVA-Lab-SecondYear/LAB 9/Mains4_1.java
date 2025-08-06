/*
4.1. Validate Email: Write a program to validate an email address using regex.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Mains4_1 {
    public static void main(String[] args) {
        String[] emails = {
            "test@example.com",
            "invalid-email",
            "another.test@domain.co",
            "example@domain",
            "valid.email@domain.com"
        };

        for (String email : emails) {
            System.out.println(email + " is " + (isValidEmail(email) ? "VALID" : "INVALID"));
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
