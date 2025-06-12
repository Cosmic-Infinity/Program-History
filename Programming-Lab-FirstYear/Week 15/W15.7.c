//WAP to copy contents of the file test.txt to another file new.txt

#include <stdio.h>

int main(){
    FILE *f1 = fopen("test15.7.txt", "r");
    FILE *f2 = fopen("test15.7new.txt", "w");

    char s[100];
    while(fscanf(f1, "%[^\n]s", s)!=EOF);

    fprintf(f2, "%s", s);

    fclose(f1);
    fclose(f2);

    return 0;
}