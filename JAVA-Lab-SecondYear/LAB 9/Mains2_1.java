/*
2.1. Reverse a String (Without Built-in Methods): Implement a function to reverse a string manually.
*/

class Mains2_1{
    public static void main(String[] args){
        System.out.println(rev("Hello"));
        System.out.println(rev("racecar"));
    }
    public static String rev(String s){
        String r = "";
        for(int i=0; i<s.length(); i++){
            r = s.charAt(i)+r;
        }
        return r;
    }
}