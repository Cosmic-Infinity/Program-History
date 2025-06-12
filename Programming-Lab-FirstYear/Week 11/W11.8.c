//Write a program to count the frequency of each character present in a string.

#include <stdio.h>


int main(){
    char s[100];
    printf("Enter a string : ");
    gets(s);
    printf("Character and their frequency : \n");
    int i = 0, j = 0,  count;
    while(s[i]!='\0'){
        if(s[i]==' '){
            i++;continue;
        }
        count = j = 0;
        while(s[j]!='\0'){
            if(s[j] == s[i]){
                count++;
                if(j!=i)
                    s[j] = ' ';
            }
            j++;
        }
        printf("%c -> %d\n", s[i], count);
        i++;
    }

    return 0;
}