//sum of left and right diagonal elements



#include <stdio.h>

int main(){
    int i,j,k, l_sum=0, r_sum=0;
	int	a[3][3];
	
	printf("Enter 3x3 (9) values for matrix :\n");
	for(i=0; i<3; i++){
		for(j=0; j<3; j++)
			scanf("%d",&a[i][j]);
	}
	
	j=0; k=2;
	for(i=0; i<3; i++){
		l_sum+=a[i][j++];
		r_sum+=a[i][k--];
	}
	
	printf("\nLeft diagonal sum :%d", l_sum);
	printf("\nRight diagonal sum :%d", r_sum);
	
	return 0;
}