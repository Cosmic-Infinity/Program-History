public class Merge_Sorted{
    public static void main(String[] args){
        int a[] = {1,5,6,7,9,11,15};
        int b[] = {2,3,4,8,10,12,13, 14};
        int c[] = new int[a.length + b.length];
        System.out.println("Array 1:");
        display(a);
        System.out.println("\nArray 2:");
        display(b);
        System.out.println("\n\nMerging Two Sorted arrays");
        merge_sorted(a,b,c); // merge two sorted arrays so result is also sorted
    }

    private static void merge_sorted(int[]a, int[]b, int[]c){
        int i=0, j=0, k=0;
        for(; i<a.length && j<b.length; ){
            if(a[i] < b[j])
                c[k++] = a[i++];
            else if(b[j] < a[i])
                c[k++] = b[j++];
            else{
                c[k++] = a[i++];
                j++;
            }
        }
        while(i<a.length)
            c[k++] = a[i++];
        while(j<b.length)
            c[k++] = b[j++];
        display(c);
    }

    private static void display(int a[]){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+", ");
    }
}