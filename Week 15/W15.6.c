//WAP to change all small letters in the file test.txt to capital letters

#include <stdio.h>

int main(){

    FILE *f = fopen("test15.6.txt", "r");
    char res[100];
    char tmp;
    int x=0;
    while(fscanf(f, "%c", &tmp) != EOF)
        res[x++] = (tmp>96 && tmp<123)? tmp-32:tmp;
    res[x] = '\0';
    fclose(f);
    f = fopen("test15.6.txt", "w");
    fprintf(f, "%s", res);
    fclose(f);
    return 0;

}