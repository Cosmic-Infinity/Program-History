#include <stdio.h>
int combination(int, int);
int fact(int);

int main(){
	int n, r;
	
	printf("Enter value for n : ");
	scanf("%d", &n);
	
	printf("Enter value for r : ");
	scanf("%d", &r);
	
	printf("Result : %d", combination(n,r));
	
	return 0;
}

int combination(int n, int r){
	int res;
	res=fact(n)/(fact(r)*fact(n-r));
}

int fact(int x){
	int i=0, fac = 1;
	for(i=2; i<=x; i++)
		fac*=i;
	
	return fac;
}