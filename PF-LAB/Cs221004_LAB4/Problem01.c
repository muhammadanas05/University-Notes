#include <stdio.h>
int main()
{
  int O,D;
  printf("Enter Number of oranges : ");
  scanf("%d",&O);
  if (O%12==0)
    {
    	D=O/12;
    	printf("%d orange makes %d dozan",O,D);
	 } 
   else
    {
    	printf("Your required oranges cannot be given in dozens");
	}
   return 0; 	
}
