#include <stdio.h>

//we were told to write for upto n-th term
//we were told to not use sqrt()

int main(){
	int n, num = 3;
	printf("n terms? : ");
	scanf("%d", &n);
	for(int i=0; i<n; ){
	 	short f = 0;
	 	int j_range = num/2;
		int j=2;
		do{
			if(num%j == 0){
				f = 1;
				break;
			}
			j++;
		}while(j<j_range);
		if(f==0){
			printf("%d\n",num);
			i++;
		}
		num++;
	}
	return 0;
}
