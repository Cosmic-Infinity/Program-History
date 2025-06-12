#include <stdio.h>

int main(){
	int n, rev=0;
	printf("Enter number : ");
	scanf("%d", &n);
	
	for(int i=n; i>0; i=i/10)
		rev = (rev*10)+(i%10); 
	printf("Original : %d, Reversed : %d\n", n, rev);
	return 0;
}
