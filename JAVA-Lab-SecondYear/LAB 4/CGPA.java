/*
7) Write a program in
java to input the details of a student having roll, name, full_mark and
secured_mark as data members using constructor, then calculate the CGPA
and display the details of student with CGPA.
 */

class CGPA{
    long roll; String name; float full; float secur;
    CGPA(long rl, String n, float fm, float sm){
        roll = rl;
        name = n;
        full = fm;
        secur = sm;
    }

    void display(){
        System.out.println("--------------------------------");
        System.out.println("Student Roll no.:\t"+roll);
        System.out.println("Student Name.:\t"+name);
        System.out.println("Student CGPA:\t"+(full/secur)*10);
    }

    public static void main(String[] args){
        CGPA ob = new CGPA(111111, "Shubham", 400, 365);
        ob.display();
    }
}