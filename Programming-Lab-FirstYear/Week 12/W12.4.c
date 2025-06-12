//WAP to print a string in reverse using a pointer.

#include <stdio.h>
void reverse(char*, int);

int main(){
    char s[100]; int len=0;
    printf("Input a string : ");
    scanf("%s",s);
    while(s[len]!='\0')
        len++;

    reverse(s, len);
    printf("Reversed string : %s\n", s);
    return 0;
}

void reverse(char *s, int len){
    
    char *begin = s;
    char *end = s+len-1;

    while (begin<end){
        char temp = *begin;
        *begin = *end;
        *end = temp;

        begin++;
        end--;
    }
    
    /*
    char rev[100];
    for(int i=0; i<len; i++)
        rev[i] = s[len-1-i];
    rev[len] = '\0';

    for(int i=0; i<len; i++){
        s[i] = rev[i];
    }
    */
    //printf("%s\n", s);
}
