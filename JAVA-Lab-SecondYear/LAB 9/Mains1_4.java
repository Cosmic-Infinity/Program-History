/*
1.4. Performance Comparison: Compare concatenation speeds of String, StringBuffer, and StringBuilder for 100,000 iterations.
 */
class Mains1_4{
    public static void main(String[] args){
        String s1 = "hello";
        StringBuffer s2 = new StringBuffer("testing testing helloo hi hi");
        StringBuilder s3 = new StringBuilder("testing testing helloo hi hi");

        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++)
            s1.concat("hi");
        System.out.println("Time taken by literal: "+(System.currentTimeMillis()-start)+ " ms");

        start = System.currentTimeMillis();
        for(int i=0; i<10000; i++)
            s2.append("hi");
        System.out.println("Time taken by Buffer: "+(System.currentTimeMillis()-start)+ " ms");

        start = System.currentTimeMillis();
        for(int i=0; i<10000; i++)
            s2.append("hi");
        System.out.println("Time taken by Builder: "+(System.currentTimeMillis()-start)+ " ms");
    }
}