#include <stdio.h>

//we were told to write for upto n-th term
//we were told to not use pow()

int main(){
	int n, pow_2 = 1;
	printf("n terms? : ");
	scanf("%d", &n);
	for(int i = 0; i<n; i++){
		pow_2 = pow_2*2;
		printf("%d\n", pow_2-1);
	}
	return 0;
}
