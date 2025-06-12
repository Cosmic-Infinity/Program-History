//WAP to find out the sum of the elements stored in a matrix

#include <stdio.h>

int main(){
	int i,j, sum=0;
	int a[3][3];
	
	printf("Enter 3x3 (9) elements : \n");
	for(i=0; i<3; i++){
		for(j=0; j<3; j++)
			scanf("%d", &a[i][j]);
	}

	for(i=0; i<3; i++){
		for(j=0; j<3; j++)
			sum+= a[i][j];
	}
	
	printf("Sum : %d\n", sum);
	
	return 0;
}
