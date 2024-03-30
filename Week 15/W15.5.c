//WAP to count the total number of words in the file test.txt

#include <stdio.h>

int main(){

    FILE *f = fopen("test15.5.txt", "r");
    int count=0;
    char c;
    while(fscanf(f, "%c", &c) != EOF){
        if(c == ' ')
            count++;
    }
    printf("%d", count+1);
    return 0;
}