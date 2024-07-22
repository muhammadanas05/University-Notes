#include<stdio.h>
int LeastSigDigit(int N);
int MostSigDigit(int N);
int main(){
	int N,LSD=0,MSD=0;
	
	printf("Enter a 3 digit number: ");
	scanf("%d",&N);
	LSD= LeastSigDigit(N);
	MSD= MostSigDigit(N);
	printf("LSD= %d",LSD);
	printf("\nMSD= %d",MSD);
	return 0;
}
	
int LeastSigDigit(int N)
	{
		int LSD=0;
		LSD=N%10;
		
		return LSD;
	}

int MostSigDigit(int N)
{
	int MSD=0;
	MSD=N/100;
	
	return MSD;	
}
