#include <stdio.h>


int main(){
	int lower, upper;
	printf("Lower Limit : ");
	scanf("%d", &lower);
	printf("Upper Limit : ");
	scanf("%d", &upper);
	
	printf("ODD\tEVEN\n");
	for(int i=lower; i<=upper; i++){
	 	if(i%2 == 1)
	 		printf("%d",i);
	 	else
	 		printf("\t%d\n",i);
	}
	if(upper%2==1) //optional
	printf("\n");
	return 0;
}
