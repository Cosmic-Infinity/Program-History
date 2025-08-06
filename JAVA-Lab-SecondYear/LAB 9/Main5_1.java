/*
5.1 Garbage Collection Check: Demonstrate how Java’s Garbage Collector (GC) handles strings inside and outside loops.
 */

public class Main5_1 {
    private static class MyObject {
        private String content;
        public MyObject(String content) {
            this.content = content;
        }

        protected void finalize() throws Throwable {
            System.out.println("Called GC for " + content);
            super.finalize();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++){
            MyObject insideLoop = new MyObject("Inside Loop " + i);
        }
        MyObject outsideLoop;
        for (int i = 0; i < 2; i++){
            outsideLoop = new MyObject("Outside Loop " + i);
        }
        System.gc(); // Suggest garbage collection

        System.out.println("End of main method");
    }
}

