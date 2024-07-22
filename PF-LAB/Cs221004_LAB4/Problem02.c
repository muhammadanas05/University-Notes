#include <stdio.h>
 
int main()
{
 
  int Y;
  printf("Enter year: ");
  scanf("%d",&Y) ;
  if(Y%4==0)
   {
   	printf("%d is a leap year",Y);
   }
   else if(Y%4==1)
   {
   	printf("Leap year come after three years");
   }
   else if(Y%4==2)
   {
   	printf("Leap year come after two years");
   }
   else if(Y%4==3)
   {
   	printf("Leap year come after one year");
   }
  return 0;
}
