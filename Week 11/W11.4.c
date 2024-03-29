//Write a program to check whether an entered string is palindrome or not.

#include <stdio.h>

int main(){
    char s[100];
    int i, len = 0;

    printf("Enter a string : ");
    scanf("%s", s);
    while(s[len]!='\0')
        len++;
    int f = 0;
    for(i=0; i<len; i++){
        if(s[i]!=s[len-1-i]){
            f=1;break;
        }
    }

    printf(f==0? "Palindrome" : "NOT Palindrome");
    return 0;
}