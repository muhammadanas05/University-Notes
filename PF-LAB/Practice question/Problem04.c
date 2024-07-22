#include<stdio.h>
int main()
{
	int n,i,j;
	char ch;
	int UC=0,LC=0,D=0,V=0,S=0;
	
	printf("Enter an integer n: ");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++)
	{
		printf("Enter number %d: ",i);
		scanf(" %c",&ch);
		
//			while(ch==NULL)
//			for(j=1; j<=5; j++)
			
			if(ch>='a' && ch<='z')
			LC+=1;
			
			if(ch>='A' && ch<='Z')
			UC+=1;
			
			if(ch>='0' && ch<='9')
			D+=1;
			
			if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U'))
			V+=1;
			
			if(ch!=((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')))
			S+=1;
//			}
	
		
	}
	printf("\tUpperCase= %d\n\tLowerCase= %d\n\tVowels= %d\n\tDigits= %d\n\tSpecial= %d",UC,LC,V,D,S);
		return 0;
}
