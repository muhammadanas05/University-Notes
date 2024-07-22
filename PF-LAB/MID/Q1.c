#include <stdio.h>
int main()
{
	int i,fac=1,num,n,n1,n2,n3,n4,E=0,O=0;
	
	printf("Enter a number: ");
	scanf("%d",&num);
	n=num;
	
	n1=n%10;
	printf("%d",n1);
	n/=10;
	n2=n%10;
	printf("%d",n2);
	n/=10;
	n3=n%10;
	printf("%d",n3);
	n/=10;
	n4=n%10;
	printf("%d",n4);
	
	if(n1%2==0)
	{E+=n1;
	}
	else
	{O+=n1;
	}
	if(n2%2==0)
	{E+=n2;
	}
	else
	{O+=n2;
	}
	if(n3%2==0)
	{E+=n3;
	}
	else
	{O+=n3;
	}
	if(n4%2==0)
	{E+=n4;
	}
	else
	{O+=n4;
	}
	printf("\n INPUT Number: %d",num);
	printf("\n Sum of odd digits = %d\n",O);
	for(i=O;i>=1;i--)
	{
		fac*=i;
	}
	printf(" Factorial of %d is: %d",O,fac);
	printf("\n SUM of Even digits = %d\n",E);
	if(num%E==0)
	{
		printf(" The original %d is divisible by sum of Even digit %d",num,E);
	}
	else
	{
		printf(" The original number %d is not divisible by sum of Even digit %d",num,E);
	}

	
	
	
	
	
	
	
	
	
	
}
