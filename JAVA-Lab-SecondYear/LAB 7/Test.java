import p1.Student;
import p2.Address;

class Test{
    public static void main(){
        test1 detail = new test1();
        test2 detail2 = new test2();
        System.out.println(detail.getNameRoll());
        System.out.println(detail2.getCityPin());
    }
}
class test1 extends Student
{
    String getNameRoll(){
        name = "ABC";
        roll = "12345";
        return name+" "+roll;
    }
}
class test2 extends Address{
    String getCityPin(){
        city = "BBSR";
        pin = "751024";
        return city+" "+pin;
    }
}

