/*
12. Combine Question number 10 and 11 and have all the three classes together. Now
describe the working of all classes.
 */

public class Demo_Both {
    public static void main(String[] args) {
        // Demonstrate HexNum
        HexNum hexNum = new HexNum(255);
        System.out.print("Hexadecimal: ");
        hexNum.showNum();

        System.out.println();

        // Demonstrate OctNum
        OctNum octNum = new OctNum(255);
        System.out.print("Octal: ");
        octNum.showNum();
    }
}
