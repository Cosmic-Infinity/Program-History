#include <stdio.h>

int main(){
	int x;
	printf("**** %d ****\n", x=5);
	
	printf("**** %d ****\n", x=0);
	
	printf("**** %d ****\n", x==5);
	
	x=9;
	printf("**** %d ****\n", x==9);
}

//compiles file. and gives output HI.
//basically the if took 0 (false)