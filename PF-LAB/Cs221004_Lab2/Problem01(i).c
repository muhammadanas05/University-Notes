#include <stdio.h>
int main(){
int n,i,j;
printf("Enter a number: ");
scanf("%d",&n);
i=1;
while(i<=n){
j=1;
while(j<=i){
printf("%d ",i);
j++;
}
printf("\n");
i++;
}
return 0;
}
