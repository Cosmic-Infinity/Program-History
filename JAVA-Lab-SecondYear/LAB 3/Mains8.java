/*
8.
Aim of the program :  Write a program in java to input and display the details of
n number of students having roll, name and cgpa as data members.
Also display the name of the student having lowest cgpa.

Input:   Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students.
Also display the name of student with lowest cgpa 
 */

import java.util.*;
class Mains8{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("How many students?");
        int len = ob.nextInt(),std_indx = 0;
        float min = 0f;
        Student[] std = new Student[len];
        for(int i = 0; i<len; i++){
            std[i] = new Student();
            System.out.print("Enter Roll No.:\t");
            std[i].roll = ob.nextLong();
            ob.nextLine();
            System.out.print("Enter Name:\t");
            std[i].name = ob.nextLine();
            System.out.print("Enter CGPA:\t");
            std[i].cgpa = ob.nextFloat();
            System.out.println("-------------------------");
        }
        System.out.println("-------------------------");
        System.out.println("Entered list of students: \n");
        System.out.println("-------------------------");
        if(len>0){
            min = std[0].cgpa;
            for(int i = 0; i<len; i++){
                System.out.print("Roll No. :\t");
                System.out.println(std[i].roll);
                System.out.print("Name :\t\t");
                System.out.println(std[i].name);
                System.out.print("CGPA :\t\t");
                System.out.println(std[i].cgpa);
                if(std[i].cgpa<min){
                    min = std[i].cgpa;
                    std_indx = i;
                }
                System.out.println("-------------------------");
            }
            System.out.println("Student with minimum CGPA is : "+std[std_indx].name);
        }
        else
            System.out.println("No students entered.");
    }
}

class Student{
    long roll;
    String name;
    float cgpa;
}