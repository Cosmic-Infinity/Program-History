#include <stdio.h>

int main(){
	int n;
	printf("Enter number of rows : ");
	scanf("%d", &n);
	
	for(int i=1 ; i<=n ; i++){
		if(i%2==1){
			for(int j = 1; j<=i; j++){
				printf("%d ", j);
			}
		}
		else{
			for(int j = i; j>0; j--){
				printf("%d ", j);
			}
		}
		printf("\n");
	}
		
	return 0;
}
