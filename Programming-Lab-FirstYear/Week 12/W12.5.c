//WAP to count vowels and consonants in a string using pointer.

#include <stdio.h>
void count(char[], int*, int*);

int main(){
    char s[100];
    int vow=0, cons=0;
    printf("Enter string : ");
    scanf("%s",s);

    count(s, &vow, &cons);

    printf("No. of Vowels : %d\n",vow);
    printf("No. of Consonants : %d\n",cons);
    
    return 0;
}

void count(char s[], int *vow, int *cons){
    int i = 0;
    while(s[i]!='\0'){
        char c = s[i];
        if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
            *cons= *cons+1;
        else
            *vow= *vow+1;
        i++;
    }
}