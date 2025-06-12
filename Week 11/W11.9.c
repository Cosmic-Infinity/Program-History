//Write a program to replace all the occurrence of a particular character in a string by its previous 3rd character, If any.

#include <stdio.h>

int main(){
    char s[100], c;
    int x = 0;
    printf("Enter string : ");
    gets(s);
    printf("Enter character : ");
    c = getchar();
    while(s[x]!='\0'){
        if(s[x]==c){
            if((x-2)>-1)
                s[x]=s[x-2];
        }
        x++;
    }

    printf("Output : %s", s);
    return 0;

}