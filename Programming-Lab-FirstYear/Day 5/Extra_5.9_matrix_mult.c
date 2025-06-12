//matrix multiplication with arbitrary matrix sizes
//matrix of arbitrary size

#include <stdio.h>

int main(){
    int i,j,k;
	
	int m=3, w=4, n=4, p=2;
	int	a[m][w], b[n][p], mul[m][p];
	
	//compatible only when w==n
	if(w!=n){
		printf("Matrix incompatible for multiplicaion\n");
		return 0;
	}
	
	printf("Enter %dx%d (%d) values for matrix A :\n",m,w,m*w);
	for(i=0; i<m; i++){
		for(j=0; j<w; j++)
			scanf("%d",&a[i][j]);
	}
	printf("Enter %dx%d (%d) values for matrix B :\n",n,p,n*p);
	for(i=0; i<n; i++){
		for(j=0; j<p; j++)
			scanf("%d",&b[i][j]);
	}
	
	for(i=0; i < m; i++){
		for(j=0; j < p; j++){
			mul[i][j] = 0;
			for(k=0; k<n/*or k<w*/; k++)
				mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
		}
	}
	
	printf("\nResultant matrix :\n");
	for(i = 0; i<m; i++){
		for(j=0; j<p; j++)
			printf("%d ",mul[i][j]);
		printf("\n");
	}
	
	return 0;
}