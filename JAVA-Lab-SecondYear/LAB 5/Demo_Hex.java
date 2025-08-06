/*
10. Write a Java program which creates a base class Num and contains an integer number
along with a method shownum() which displays the number. Now create a derived class
HexNum which inherits Num and overrides shownum() which displays the hexadecimal
value of the number. Demonstrate the working of the classes.
 */
public class Demo_Hex {
    public static void main(String[] args) {
        int n = 255;
        Num num = new Num(n);
        num.showNum();
        System.out.println();
        HexNum hexNum = new HexNum(n);
        hexNum.showNum();
    }
}

class Num {
    int number;
    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    public void showNum() {
        int num = number;
        String hexString = "";
        char[] hexDigits = "0123456789ABCDEF".toCharArray();

        if (num == 0) {
            hexString = "0";
        } else {
            while (num > 0) {
                int digit = num % 16;
                hexString = hexDigits[digit] + hexString;
                num /= 16;
            }
        }

        System.out.println("Hexadecimal Number: " + hexString);
    }
}

