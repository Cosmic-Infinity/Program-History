//Write a C program to remove all leading and trailing spaces from a given string, if any.

#include <stdio.h>

int main(){
    char s[100], res[100];
    int begin = 0, end=0, res_len=0;
    printf("Enter string : ");
    gets(s);
    while(s[end++]!='\0'); //calculated the length
    end-=1;
    while(s[begin++]==' '); //moved the begin pointer to the first non-space character
    begin-=1;
    while(s[--end]==' '); //moved the end pointer to the first non-space character

    for(; begin<=end; begin++)
        res[res_len++]=s[begin];
    res[res_len]='\0';
    printf("Result :\n%s", res);

    return 0;
}