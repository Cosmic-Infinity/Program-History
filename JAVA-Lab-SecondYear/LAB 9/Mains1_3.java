/*
1.3. String Memory Usage: Write a program to show how multiple references can point to the same string object in memory.
*/

class Mains1_3{
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("Instance ID of s1: "+System.identityHashCode(s1));
        System.out.println("Instance ID of s2: "+System.identityHashCode(s2));
        System.out.println("Both identity hashes are same. \nBoth refer to the same memory.");
    }
}