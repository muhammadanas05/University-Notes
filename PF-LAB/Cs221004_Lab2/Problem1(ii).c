#include <stdio.h>
int main(){
	int n,i,j;
	printf("Enter a number: ");
	scanf("%d",&n);
	i=1;
	do
	{
		j=1;
		do
		{
			printf("%d ",i);
			j++;
			
		}while (j<=i);
		i++;
		printf("\n");
	}while(i<=n);
	return 0;
}
