#include <stdio.h>

int main(){
	int x;
	if(x=0)
		printf("HELLO\n");
	else
		printf("HI\n");
	
	if(x=1)
		printf("HELLO\n");
	else
		printf("HI\n");
	
	if(x=4546)
		printf("HELLO\n");
	else
		printf("HI\n");
	
	if(x=-4454)
		printf("HELLO\n");
	else
		printf("HI\n");
}

//compiles file. and gives output HI.
//basically the if took 0 (false)