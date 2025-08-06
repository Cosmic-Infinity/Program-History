import com.example.util.MathOperations;

public class Mains11 {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        
        int sum = mathOps.add(5, 3);
        int difference = mathOps.subtract(5, 3);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
