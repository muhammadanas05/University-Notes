#include <stdio.h>
int main() {
int i,j,size,x=0;

printf("ENTER LENGTH\nSize: ");
scanf("%d", &size);
int array[size * 2];
for (i = 0; i < size; i++) {
printf("ENTER the %d ELEMENT OF AN ARRAY : ", i);
scanf("%d", & array[i]);
}

printf("\tElement of an original array are: ");
for (i = 0; i < size; i++) {
printf("%d", array[i]);
if (i < size - 1) {
printf(", ");
}
}
printf("}\n");

for (i = 0; i < size - 1; i++) 
{
for (j = 0; j < size - i - 1; j++) 
{
if (array[j] > array[j + 1]) 
{
x = array[j];
array[j] = array[j + 1];
array[j + 1] = x;
}
}
}
printf("\tElement of array after sorting are: ");
for (i = 0; i < size; i++) {
printf("%d", array[i]);
if (i < size - 1) {
printf(", ");
}
}
printf("}\n");
}
