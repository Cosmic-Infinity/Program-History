/*
5.4. Compare == vs .equals(): Write a program to demonstrate why == and .equals() behave differently for strings.
 */

public class Main5_4 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        // Using ==
        System.out.println("Using ==:");
        System.out.println(str1 == str2); // false - different objects
        System.out.println(str3 == str4); // true - same object in string pool

        // Using .equals()
        System.out.println("Using .equals():");
        System.out.println(str1.equals(str2)); // true - same content
        System.out.println(str3.equals(str4)); // true - same content
    }
}
