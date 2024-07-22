#include <stdio.h>
int main()
{
	int N,i,Sum=0;
	
	printf("Enter value of N: ");
	scanf("%d",&N);
	
	for(i=1;i<=N;i++)
		{
		Sum+=i*i;
		}
	printf("The sum of series = %d",Sum);	
}
