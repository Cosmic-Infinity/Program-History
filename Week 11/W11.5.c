//Write a C program to extract a substring from a given string. Prompt the user to enter
//the starting position and length of the substring.

#include <stdio.h>

int main(){
    char s[100], res[100];
    int begin, len, end, x=0;
    printf("Enter string : ");
    scanf("%s", s);
    printf("Enter begin from index and length of substring : ");
    scanf("%d%d",&begin, &len);
    end = begin+len;
    for(; begin<end; begin++)
        res[x++] = s[begin];
    res[x]='\0';
    printf("%s", res);
    return 0;
}