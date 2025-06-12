//WAP to append the phrase “with a strong interdisciplinary culture and a commitment to teaching excellence” into the file test.txt

#include <stdio.h>

int main(){

    FILE *f = fopen("test15.3.txt", "a");
    char s[] = {"This text was appended right now!"};

    fprintf(f,"%s", s);

    fclose(f);
    return 0;
}