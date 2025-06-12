//Write a program to count the number of vowels, consonants, new lines and the total number of
//characters and words present in a string.

#include <stdio.h>

int main(){
    char s[100];
    int vow =0, cons = 0, nline = 0, charac = 0, wrd =0;
    int x = 0;
    printf("Enter string : ");
    gets(s);
    nline++;

    while(s[x]!='\0'){
        char c = s[x++];
        if(c == '.' || c==',' || c=='?' || c=='!')
            continue;
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            vow++;
        else
            cons++;
        if(c==' '){
            wrd++;cons--;
        }
    }
    wrd++;
    charac = vow+cons;

    printf("No. of Vowels : %d\n", vow);
    printf("No. of Consonants : %d\n", cons);
    printf("No. of New Line : %d\n", nline);
    printf("No. of Characters : %d\n", charac);
    printf("No. of Words : %d\n", wrd);

    return 0;

}