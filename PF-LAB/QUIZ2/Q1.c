#include <stdio.h>

int main()
{
	int i = 0, count = 0;
	int n, x, k = 0;
	printf("inset n: "); scanf("%d", &n);
	printf("insert x: "); scanf("%d", &x);
	
	for(i = 0; i<n; i++){
		printf("Enter Number : ");
		scanf("%d", &k);
		if(k % x == 0){
			count++;
		}
	}
	printf("total: %d", count);
	return 0;
}
