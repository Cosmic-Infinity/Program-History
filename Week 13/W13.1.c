//WAP to store one student’s information (i.e. student’s roll no, name, gender, marks etc) of an educational institute and display all the data, using structure

#include <stdio.h>

typedef struct student_details{
    char name[32];
    int rollno;
    int marks;
    char gender;
} stdata;

int main(){
    stdata s1;
    printf("Enter student name :\t");
    gets(s1.name);
    printf("Enter student roll no.: ");
    scanf("%d",&s1.rollno);
    printf("Enter student gender :\t ");
    scanf(" %c",&s1.gender);
    printf("Enter student marks : \t");
    scanf("%d",&s1.marks);

    printf("\nStudent Details\n");

    printf("Student name : \t\t%s \n", s1.name);
    printf("Student roll no. : \t%d \n", s1.rollno);
    printf("Student gender : \t%c \n", s1.gender);
    printf("Student marks : \t%d \n", s1.marks);


    return 0;
}