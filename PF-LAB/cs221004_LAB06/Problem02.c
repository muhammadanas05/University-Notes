#include <stdio.h>
int main()
{
	int n,num,Tot=0,r;
	printf("Enter a three-digit integer: ");
    scanf("%d", &n);
    num = n;
    while(num!=0)
    {
    	r= num%10;
    	Tot += r*r*r;
    	num = num/10;
    	
	}
	if (Tot == n)
        printf("%d is an Armstrong number.", n);
    else
        printf("%d is not an Armstrong number.", n);
}

