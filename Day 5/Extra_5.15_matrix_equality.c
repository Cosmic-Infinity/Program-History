#include <stdio.h>

int main(){
	
	int i, j, f=0, a[3][3], b[3][3];
	
	printf("Enter Matrix A elements :\n");
	for(i=0; i<3; i++){
		for(j=0; j<3; j++)
			scanf("%d",&a[i][j]);
	}
	
	printf("Enter Matrix B elements :\n");
	for(i=0; i<3; i++){
		for(j=0; j<3; j++)
			scanf("%d",&b[i][j]);
	}
	
	for(i=0; i<3; i++){
		for(j=0; j<3; j++){
			if(a[i][j] != b[i][j]){
				f=1; break;
			}
		}
		if(f==1)break;
	}
	
	printf(f==0?"Equal Matrix" : "NOT Equal");
	
	return 0;
}