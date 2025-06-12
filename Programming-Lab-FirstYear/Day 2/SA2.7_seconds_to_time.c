#include <stdio.h>

int main(){
	int hr, min, sec;
	printf("Enter seconds : ");
	scanf("%d", &sec);
	min = sec/60;
	sec = sec%60;
	hr = min/60;
	min = min%60;
	printf("%d Hour %d Minutes %d Seconds \n", hr, min, sec);
	
	return 0;
}
