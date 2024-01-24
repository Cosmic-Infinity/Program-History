#include <stdio.h>

int main(){
	int c;
	printf("Enter temperature in Centigrade : ");
	scanf("%d",&c);
	printf("Fahrenheit temperature : %f \n",(((9.0/5.0)*c)+32.0));
	return 0;
	

}
