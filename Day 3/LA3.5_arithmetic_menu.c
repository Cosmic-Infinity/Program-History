#include <stdio.h>

int main(){
	int a, b,c;
	printf("Enter first number : ");
	scanf("%d", &a);
	printf("Enter second number : ");
	scanf("%d", &b);
	printf("Enter 1 to perform addition (%d+%d)\n",a,b);
	printf("Enter 2 to perform subtraction (%d-%d)\n",a,b);
	printf("Enter 3 to perform multiplication (%d*%d)\n",a,b);
	printf("Enter 4 to perform division (%d/%d)\n",a,b);
	scanf("%d",&c);
	
	switch(c){
		case 1: printf("Sum = %d\n",a+b);
		break;
		case 2: printf("Subtraction = %d\n",a-b);
		break;
		case 3: printf("Product = %d\n",a*b);
		break;
		case 4: printf("Quotient = %d\n",a/b);
		break;
		default: printf("Wrong Choice\n");
	}
	
	return 0;
}