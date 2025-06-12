#include <stdio.h>

int main(){
	char c;
	printf("Enter a character : ");
	scanf("%c", &c);
	if(c>96 && c<123)
		printf("%c is already Lower Case\n",c);
	else
		printf("%c\n",c+32);
	return 0;
}