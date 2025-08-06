import java.util.Scanner;
class Array_Operation{

    public static void main(String[] args){
        int a[] = new int[5];
        int b[] = new int[5];
        System.out.println("Input array");
        read_arr(a, b); //read an array and diaplay it
        System.out.println("Read array : ");
        display(a);
        System.out.println("\nDeleting only even elements");
        delete_even(a); //delete all even elements
        System.out.println("\nDeleting only odd elements");
        delete_odd(b); //delete all odd elements
    }

    private static void read_arr(int[] a, int[] b){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter "+a.length+" numbers");
        for(int i=0; i<a.length; i++){
            a[i] = ob.nextInt();
            b[i] = a[i];
        }
    }

    private static void display(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+", ");
        System.out.println();
    }

    private static void delete_even(int a[]){
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                if (i != j)
                    a[j] = a[i]; //just bring them over to front
                j++;
            }
        }
        for (;j < a.length; j++) //zero the elements on the back which are duplicate odd or some even numbers
            a[j] = 0;
        display(a);
    }

    private static void delete_odd(int a[]){
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (i != j)
                    a[j] = a[i]; //just bring them over to front
                j++;
            }
        }
        for (;j < a.length; j++) //zero the elements on the back which are duplicate odd or some even numbers
            a[j] = 0;
        display(a);
    }
}