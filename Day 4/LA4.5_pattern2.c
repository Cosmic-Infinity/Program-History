#include <stdio.h>

//we were told to write for upto n-th term

int main(){
	int n;
	int fn = 1, sn = 1, add = 0;
	printf("n terms? : ");
	scanf("%d", &n);
	for(int i=1; i<n; i++){
		printf("%d\n",fn);
		add = fn+sn;
		fn = sn;
		sn = add;
	}
	return 0;
}
