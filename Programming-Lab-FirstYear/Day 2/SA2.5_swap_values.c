#include <stdio.h>

int main(){
	int a,b,c;
	printf("Enter num1 : ");
	scanf("%d",&a);
	printf("Enter num2 : ");
	scanf("%d",&b);
	printf("Before Swapping \n");
	printf("num1=%d, num2=%d",a,b);
	c = a;
	a = b;
	b = c;
	printf("\nAfter Swapping \n");
	printf("num1=%d, num2=%d \n",a,b);
	return 0;
}
