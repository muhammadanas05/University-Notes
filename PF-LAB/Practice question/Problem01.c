#include<stdio.h>
int main(){
	
	int i,n,k,min=999,max=0,sum=0;
	
	printf("Enter an integer n: ");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++)
	{
		printf("Enter number %d: ",i);
		scanf("%d",&k);
		
			if(max < k)
			max = k;

		if(min > k)
			min = k;
	}
	printf("\n Sum = %d",max+min);
	return 0;
}
		
