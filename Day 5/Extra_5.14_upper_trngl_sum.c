#include <stdio.h>

int main(){
	int i, j, sum=0, a[4][4];
	
	printf("Enter 4x4 matrix : \n");
	for(i=0; i<4; i++){
		for(j=0; j<4; j++)
			scanf("%d",&a[i][j]);
	}
	
	for(i=0; i<4; i++){ // can also do -> for(i=3; i>-1; i--)
		for(j=3; j>-1; j--){
			sum+= a[i][j];
			if(i==j)break;
		}
	}
	
	printf("Sum of elements : %d",sum);
	
	return 0;
	
}
	