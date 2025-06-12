#include <stdio.h>
int add(int, int);
int subt(int, int);
int mul(int,int);
int div(int,int);

int main(){
	int x, y, choice;
	
	printf("Enter first integer :");
	scanf("%d",&x);
	
	printf("Enter second integer :");
	scanf("%d",&y);
	
	printf("Enter choice :\n");
	printf("1 for addition, 2 for subtraction, 3 for multiplication, 4 for division\n");
	scanf("%d",&choice);
	
	switch (choice){
		case 1 : printf("Addition : %d\n",add(x,y));
		break;
		case 2 : printf("Subtraction : %d\n",subt(x,y));
		break;
		case 3 : printf("Multiplication : %d\n",mul(x,y));
		break;
		case 4 : printf("Division : %d\n",div(x,y));
		break;
		default : printf("Wrong Choice");
	}
	
	return 0;

}

int add(int x, int y){
	return (x+y);
}

int subt(int x, int y){
	return (x-y);
}

int mul(int x, int y){
	return (x*y);
}

int div(int x, int y){
	return (x/y);
}