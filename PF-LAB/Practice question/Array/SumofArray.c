#include <stdio.h>

void main()
{
   int i,n,sum=0;
   
   
   printf("Input the number of elements to store in the array :");
   scanf("%d",&n);
   
   int a[n];
 
   for(i=0; i<n; i++)
   {
	printf("Enter element %d: ",i);
	scanf("%d",&a[i]);
//	sum+=a[i];   		
   }
   
   for(i=0; i<n; i++)
   {
   	sum += a[i];
   }
   
   printf("Sum of array = %d",sum);
   
}
