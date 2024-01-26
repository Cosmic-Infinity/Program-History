#include <stdio.h>

//we were told to write for upto n-th term
//we were told to not use sqrt()

int main(){
	int n;
	int num = 3;
	printf("n terms? : ");
	scanf("%d", &n);
	for(int i=1; i<n; ){
	 	short f = 0;
	 	int j_range = num/2;
		for(int j=2; j<j_range; j++){
			if(num%j == 0){
				f = 1;
				break;
			}
		}
		if(f==0){
			printf("%d\n",num);
			i++;
		}
		num++;
	}
	return 0;
}
