#include <stdio.h>

int main(){

	int a[10], i;
	
	for(i = 0; i<10; i++)
		printf("%p ", &a[i]);
	
	//
	//c follows row major ordering, i.e the next column cell is previous column cell address+1
}