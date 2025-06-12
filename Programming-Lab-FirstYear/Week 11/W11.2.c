//Write a program to extract last character of every word present in a sentence.

#include <stdio.h>

int main(){
    char s[100];
    int i=0;
    printf("Enter a sentence : ");
    scanf("%[^\n]s", s);

    printf("Last character of ever word : ");
    while(s[i]!='\0'){
        if(s[i] == ' ')
            printf("%c ",s[i-1]);
        i++;
    }
    printf("%c ",s[i-1]);

    return 0;
}