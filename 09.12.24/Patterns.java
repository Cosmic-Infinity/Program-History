import java.util.Scanner;
class Patterns{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter integer input : ");
        int n = ob.nextInt();
        star_left(n);
        number_left(n);
        star_right(n);
        star_diamond(n);
    }

    private static void star_left(int n){
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void number_left(int n){
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    private static void star_right(int n){
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    private static void star_diamond(int n) {
        System.out.println();
        for (int i = 1; i<=n; i++) {
            for (int j = n-i; j>0; j--)
                System.out.print(" ");
            for (int j = 0; j < (2*i-1); j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
    }

}