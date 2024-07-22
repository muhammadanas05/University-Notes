#include <stdio.h>
int main(){
	
	int h,i,j,k,l;
	
	printf("Enter the height of wall: ");
	scanf("%d",&h);
	
	int rh=h-1,w=2*h;
	
	for(i=1; i<=rh; i++)
	{
		printf(" ");
		for(j=1; j<=rh*2; j++)
		{
			if(5-i<=j && j<=4+i)
			{
				printf("*");
			}
			else
			printf(" ");
		}
		printf(" \n");
	}
	
	for(k=1; k<=h; k++)
	{
		for(l=1; l<=w; l++)
		{
			printf("*");
		}
		printf("\n");
	}
	
}
