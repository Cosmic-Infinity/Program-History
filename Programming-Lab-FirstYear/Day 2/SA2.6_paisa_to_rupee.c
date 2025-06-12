#include <stdio.h>

int main(){
	int psa, rupe;
	printf("Enter Paisa : ");
	scanf("%d", &psa);
	rupe = psa / 100;
	psa = psa % 100;
	printf("%d Rupee %d Paisa \n", rupe, psa);
	//printf("%3.2f",(float)22/7);
	return 0;
}
