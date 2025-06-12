//Write a C program to find the first largest word in a given sentence.
//Assume that words are separated by spaces.

#include <stdio.h>

int main(){
    char s[100], res[100];
    int begin = 0, end = 0, max = 0, len = 0, x;
    printf("Enter string : ");
    gets(s);
    while(s[end]!='\0')
        end++;          //found length of string
    s[end+1] = s[end];  //moving the null termintor one space forward
    s[end] = ' ';       //and adding space in it's place to help with isolating words
    end = 0;      
    while(s[end]!='\0'){
        if(s[end] == ' '){
            len = end-begin;    //len variable reused to iterate over length of the current word
            if(len > max){
                max = len;
                x = 0;
                for(; begin<end; begin++)
                    res[x++] = s[begin];
            }
            begin = end+1; 
        }
        end++;
    }
    res[max]='\0';


    printf("%s -> %d", res, max);

    return 0;
}