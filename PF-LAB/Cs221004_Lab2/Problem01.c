#include<stdio.h>
int DeliveryCharge(int P);
int main(){
	int P,DC=150;
	
	printf("Enter amount of purcahse: ");
	scanf("%d",&P);
	DC= DeliveryCharge(P);
	printf("DELIVERY CHARGES: %d",DC);
	return 0;
}
	
int DeliveryCharge(int P)
	{
		int DC=150;
		if(P<=1000)
		DC+=P;
		else
		DC=P;
		return DC;
	}

