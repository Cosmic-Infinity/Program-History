//WAP to count the total number of characters in the file test.txt

#include <stdio.h>

int main(){

    FILE *f = fopen("test15.4.txt", "r");
    int count=0;
    while(fscanf(f, "%c") != EOF){
        count++;
    }
    printf("%d", count);
    return 0;
}