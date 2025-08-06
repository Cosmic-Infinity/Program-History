/*
1.5. Interning Behavior: Write a program that forces String.intern() to show how it affects memory allocation.
 */
class Mains1_5{
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println("Instance ID of s1: "+System.identityHashCode(s1));
        System.out.println("Instance ID of s2: "+System.identityHashCode(s2));
        System.out.println("Different instance ID");
        System.out.println("Instance ID of s1: "+System.identityHashCode(s1));
        System.out.println("Instance ID of s2: "+System.identityHashCode(s2.intern()));
        System.out.println("Same instance ID after Intern");
    }
}