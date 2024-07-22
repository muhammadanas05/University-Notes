#include <stdio.h>
int main(){

	int n,i,j;
	char k;
	
	printf("Enter the value of row/column: ");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++)
	{
		k='A';
		for(j=1; j<=n; j++)
		{
			if(j<=(n+1)-i)
			printf("% 2c",k);
			else
			printf(" ");
			k++;
		}
		printf("\n");	
	}
	for(i=1; i<=n; i++)
	{
		k='A';
		for(j=1; j<=n; j++)
		{
			if(j<=i)
			printf("% 2c",k);
			else
			printf(" ");
			k++;
		}
		printf("\n");	
	}

}
