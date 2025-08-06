/*
11. Write a Java program which creates a base class Num and contains an integer number
along with a method shownum() which displays the number. Now create a derived class
OctNum which inherits Num and overrides shownum() which displays the octal value of
the number. Demonstrate the working of the classes.
 */
public class Demo_Octal {
    public static void main(String[] args) {
        int n =255;
        Num num = new Num(n);
        num.showNum();
        System.out.println();
        OctNum octNum = new OctNum(n);
        octNum.showNum();
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

class OctNum extends Num {

    public OctNum(int number) {
        super(number);
    }

    public void showNum() {
        int num = number;
        String s = "";
        char[] octalDigits = "01234567".toCharArray();

        if (num == 0) {
            s = "0";
        } else {
            while (num > 0) {
                int digit = num % 8;
                s = octalDigits[digit] + s;
                num /= 8;
            }
        }

        System.out.println("Octal Number: " + s);
    }
}
