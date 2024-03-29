//Write a C program to replace multiple occurrences of a specific word present in a given sentence with a single occurrence.

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
    char s[100], wrd[100];
    char *res = (char*)calloc(100, sizeof(char));
    printf("Enter string : ");
    gets(s);
    int len = strlen(s);
    s[len+1] = s[len];  //moving the null termintor one space forward
    s[len] = ' ';
    int x=0, j=0;

    while(s[x]!='\0'){
        if(s[x]==' '){
            wrd[j]=' ';
            wrd[j+1] = '\0';
            if(strstr(s+x+1, wrd) == NULL){
                res = strcat(res, wrd);
            }
            j=0;
        }
        else
            wrd[j++]=s[x];
        x++;
    }

    printf("Result : %s", res);

    return 0;
}