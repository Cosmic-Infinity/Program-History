/*18. **Packages and Static Imports:**
Define a class `MathUtils` in the package `com.util` with a static method `add(int a, int b)`.
 In another class, use a static import to directly use `add()` without the class name.
 Show how static imports work and discuss potential pitfalls.
*/

import static com.util.MathUtils.add;

public class Mains18 {
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("The result is: " + result);
    }
}

/*
Name Conflicts: Static imports can lead to naming conflicts if multiple classes have static methods with the same name. This can make the code harder to read and understand.

Reduced Readability: Overusing static imports can make it less clear which class a method belongs to, reducing the readability of the code.

Maintenance Challenges: If the class or method names change, it can be more challenging to update the code due to the ambiguity created by static imports.
*/
