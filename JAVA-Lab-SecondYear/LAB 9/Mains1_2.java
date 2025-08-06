/*
1.2. Prove Immutability: Write a program to prove that String objects are immutable in Java.
*/

class Mains1_2{
    public static void main(String[] args){
        String s1 = "hello";
        s1.concat(" Shubham");
        System.out.println("String did not change: "+s1);
    }
}