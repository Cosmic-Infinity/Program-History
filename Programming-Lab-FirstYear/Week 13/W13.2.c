//WAP to store n students’ information (i.e. student’s roll no, name, gender, marks in 5 subjects etc) of an educational institute
//and display all the data with total marks of each student, using array of structure. If full mark of each subject is considered as 100
//and pass mark as 40, then display the list of students failed in a particular subject.

#include <stdio.h>

typedef struct student_details{
    char name[32];
    int rollno;
    int marks[5];
    char gender;
} stdata;

int main(){
    stdata s[100];
    int no_ofstudent=0, fail_subject, failed_stud=0, total;
    printf("Enter number of students : ");
    scanf("%d", &no_ofstudent);
    for(int i=0; i<no_ofstudent; i++){
        printf("Enter student %d\'s data -\n", i+1);
        printf("Enter student name : ");
        scanf("%s",&s[i].name);
        printf("Enter student roll no. : ");
        scanf("%d",&s[i].rollno);
        printf("Enter student gender : ");
        scanf(" %c",&s[i].gender);
        for(int j=0; j<5; j++){
            printf("Marks in subject %d : ", j+1);
            scanf("%d", &s[i].marks[j]);
        }
    }

    printf("Enter subject number whose fail list to display : ");
    scanf("%d", &fail_subject);
    fail_subject--;

    for(int i=0; i<no_ofstudent; i++){
            if(s[i].marks[fail_subject]<40)
                failed_stud++;
    }


    printf("\nStudent Details are -\n");

    for(int i=0; i<no_ofstudent; i++){
        total = 0;
        printf("Name : %s\n", s[i].name);
        printf("Roll no. : %d\n",s[i].rollno);
        printf("Gender : %c\n",s[i].gender);
        printf("Total marks : ");
        for(int j=0; j<5; j++)
            total+=s[i].marks[j];
        printf("%d\n\n", total);
    }

    printf("\nList of fail students: %d", failed_stud);


    return 0;
}