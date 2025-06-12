#include <stdio.h>

int main(){
	int a, b;
	printf("Entre first number : ");
	scanf("%d",&a);
	printf("Entre second number : ");
	scanf("%d",&b);
	printf("Before Swap\n");
	printf("First number %d, Second number %d\n", a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("After Swap\n");
	printf("First number %d, Second number %d\n", a,b);
	return 0;
}