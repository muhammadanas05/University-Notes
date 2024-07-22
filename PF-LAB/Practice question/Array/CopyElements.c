#include <stdio.h>
int main(){
	
	int n,i,b[1000];
	
	printf("Enter integer n: ");
	scanf("%d",&n);
	
	int a[n];
	
	for(i=0; i<n; i++)
	{
		printf("Enter element %d: ",i);
		scanf("%d",&a[i]);
	}
	
	for(i=0; i<n; i++)
	{
		b[i]=a[i];
	}
		
	printf("\nThe elements stored in the first array are :\n");
    for(i=0; i<n; i++)
    {
        printf("% d", a[i]);
    }
    
    printf("\nThe elements stored in the first array are :\n");
    for(i=0; i<n; i++)
    {
        printf("% d", b[i]);
    }
    
}
