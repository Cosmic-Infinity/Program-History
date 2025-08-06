/*
1.1. String Pool Exploration: Write a program to demonstrate Java’s String pool.
 Explain how new String("hello") differs from "hello".
*/

class Mains1_1{
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println("Instance ID of s1: "+System.identityHashCode(s1));
        System.out.println("Instance ID of s2: "+System.identityHashCode(s2));
        System.out.println("Instance ID of s3: "+System.identityHashCode(s3));
    }
}

/*
   "hello" is string literal created in the string pool. 
   new String("hello") is a string object created in the heap, even if it exixts in the pool
   */