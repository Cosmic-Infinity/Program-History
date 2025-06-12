#include <stdio.h>

int main(){
	int a, b;
	printf("Enter first number : ");
	scanf("%d", &a);
	printf("Enter second number : ");
	scanf("%d",&b);
	if(a>b)
		printf("%d is greater\n",a);
	else
		printf("%d is greater\n",b);
	return 0;
}