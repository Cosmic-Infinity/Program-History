
#include <stdio.h>
#include <math.h>

int main(){
	int a, b, c;
	float s;
	double area;
	printf("Enter first side : ");
	scanf("%d",&a);
	printf("Enter second side : ");
	scanf("%d",&b);
	printf("Enter third side : ");
	scanf("%d",&c);
	s = (a+b+c)/2.0;
	area = sqrt(s*(s-a)*(s-b)*(s-c));
	printf("The area of the triangle is : %f \n",area);
	return 0;
}
