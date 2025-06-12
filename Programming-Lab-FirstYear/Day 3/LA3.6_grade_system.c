#include <stdio.h>

int main(){
	int marks;
	printf("Enter marks : ");
	scanf("%d", &marks);
	
	if(marks>89)
		printf("O grade\n");
	else if(marks >79)
		printf("E grade\n");
	else if(marks >69)
		printf("A grade\n");
	else if(marks >59)
		printf("B grade\n");
	else if(marks >49)
		printf("C grade\n");
	else if(marks >39)
		printf("D grade\n");
	else
		printf("FAIL grade\n");
	
	return 0;
}