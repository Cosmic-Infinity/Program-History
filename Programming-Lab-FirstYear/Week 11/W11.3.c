//Write a program to concatenate two strings without using any library function.

#include <stdio.h>

int main(){
    char s1[100], s2[100], s3[200];
    int i=0, x=0;

    printf("Enter string 1 : ");
    gets(s1);
    printf("Enter string 2 : ");
    gets(s2);
    while(s1[i]!='\0')
        s3[x++] = s1[i++];
    i=0;
    while(s2[i]!='\0')
        s3[x++] = s2[i++];
    s3[x]='\0';
    printf("Resultant String : %s", s3);

    return 0;
}