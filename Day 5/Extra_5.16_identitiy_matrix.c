#include <stdio.h>

int main(){
	//identity is only for square matrices;
	int i, j,f=0, a[4][4];
	
	printf("Enter 4x4 matrix : \n");
	for(i=0; i<4; i++){
		for(j=0; j<4; j++)
			scanf("%d",&a[i][j]);
	}
	
	for(i=0; i<4; i++){
		if(a[i][i] != 1){
			f=1;break;
		}
		for(j=0; j<4; j++){
			if(i==j)continue;
			if(a[i][j] !=0){
				f=1;break;
			}
		}
	}
	
	printf(f==0?"Identity Matrix" : "NOT Identity");
	
	return 0;
	
}
	