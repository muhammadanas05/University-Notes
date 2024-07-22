#include <stdio.h>
int main(){
	
	long int  n,sum=0;
	int i,num=0;
	
	printf("Enter an integer n: ");
	scanf("%d",&n);
	
	while(n!=0)
	{
		num=n%10;
		sum+=num;
		n/=10;
		
	}
	printf("Sum of digits = %d", sum);
	return 0;
}
