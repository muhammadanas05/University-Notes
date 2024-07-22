#include <stdio.h>

int main()
{
   int A[100],i,n,p=1,insert,min=0,max=0;
       
    printf("Input the size of array : ");
    scanf("%d", &n);

       for(i=0;i<n;i++)
            {
	      printf("%d) Input: Nums= ",i);
	      scanf("%d",&A[i]);
	    }
   printf("\n\nInput Rollno : ");
   scanf("%d",&insert);
   printf("\nThe exist array list is :\n");
   for(i=0;i<n;i++)
      printf("% 5d",A[i]);
      
 
    min=max=A[0];
    for(i=1; i<n; i++)
    {
        if(min>A[i])
		    min=A[i];   
		if(max<A[i])
		{
			max=A[i]; 
		}
		          
    }
    
    for(i=0; i<=n; i++)
    {
    	if(max==A[i])
    	p=i+1;
	}

	for(i=n+1;i>=p;i--)
      A[i]= A[i-1];
      A[p]=insert;
      printf("\n\nAfter Insert the list is :\n");
   for(i=0;i<=n;i++)
      printf("% 5d",A[i]);
	  printf("\n");

 
    return 0;
}


