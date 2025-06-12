//matrix symmetry check



#include <stdio.h>

int main(){
    int i, j, f=0;
	int	a[3][3];
	
	printf("Enter 3x3 (9) values for matrix :\n");
	for(i=0; i<3; i++){
		for(j=0; j<3; j++)
			scanf("%d",&a[i][j]);
	}
	
	for(i=0; i<3; i++){
		for(j=0; j<3; j++){
			if(a[i][j]!=a[j][i]){
				f=1;
				break;
			}
		}
		if(f==1)break;
	}
	
	printf(f==0?"Symmetric" : "NOT Symmetric");
	
	return 0;
}