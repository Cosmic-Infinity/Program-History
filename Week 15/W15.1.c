//WAP to read and print the content of a file test.txt

#include <stdio.h>

int main(){

    FILE *f = fopen("test15.1.txt", "r");
    char s[100];
    while(fscanf(f, "%[^\n]s", &s) != EOF );
    printf("%s", s);

    fclose(f);
    return 0;
}