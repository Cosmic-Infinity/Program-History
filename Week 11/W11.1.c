//WAP to find the length of a string with/without using library function for getting length of the string
#include <stdio.h>

int main(){

    char s[100];
    int i=0;

    printf("Enter string : ");
    scanf("%[^\n]s", s);
    while(s[i]!='\0')
        i++;
    printf("Length : %d", i);
    return 0;
}