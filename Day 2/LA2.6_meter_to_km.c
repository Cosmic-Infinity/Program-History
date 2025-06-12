#include<stdio.h>

int main(){
	int m, k;
	printf("Enter meters : ");
	scanf("%d",&m);
	k = m/1000;
	m = m%1000;
	printf("%d Km and %d meters\n", k, m);
	return 0;
}