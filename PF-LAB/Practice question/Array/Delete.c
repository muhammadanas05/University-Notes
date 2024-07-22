#include <stdio.h>

void main(){
  int arr1[50],i,pos,n;
  
       printf("\n\nDelete an element at desired position from an array :\n");
       printf("---------------------------------------------------------\n");  
  
       printf("Input the size of array : ");
       scanf("%d", &n);
    /* Stored values into the array*/
       printf("Input %d elements in the array in ascending order:\n",n);
       for(i=0;i<n;i++)
            {
	      printf("element - %d : ",i);
	      scanf("%d",&arr1[i]);
	    }

  printf("\nInput the position where to delete: ");
  scanf("%d",&pos);
/*---- locate the position of i in the array -------*/
  i=0;
  while(i!=pos-1)
            i++;
/*---- the position of i in the array will be replaced by the 
       value of its right */
  while(i<n){
            arr1[i]=arr1[i+1];
            i++;
  }
  n--;
   printf("\nThe new list is : "); 
  for(i=0;i<n;i++)
        {
		   printf("  %d",arr1[i]);
		}  
            printf("\n\n");

}

