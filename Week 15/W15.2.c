//WAP to write the text From the small beginnings KIIT has developed into a leading university into a file test.txt


#include <stdio.h>

int main(){

    FILE *f = fopen("test15.2.txt", "w");
    char s[] = {"This is again a test file!!"};

    fprintf(f, "%s", s);

    fclose(f);
    return 0;
}