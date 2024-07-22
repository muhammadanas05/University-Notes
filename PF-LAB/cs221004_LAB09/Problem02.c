#include <stdio.h>
int main() {
int i,j,size,E,x=0;

printf("ENTER SIZE\nSize: ");
scanf("%d", & size);
int array[size * 2];
for (i = 0; i < size; i++) {
printf("ENTER the %d ELEMENT OF AN ARRAY : ", i);
scanf("%d", & array[i]);
}

printf("\tElement of array are: ");
for (i = 0; i < size; i++) {
printf("%d", array[i]);
if (i < size - 1) {
printf(", ");
}
}
printf("\n");
printf("ENTER THE ELEMENT TO SEARCH IN AN ARRAY: ");
scanf("%d", &E);

for (i = 0; i <size; i++) {
if (array[i] == E) {
printf("Element %d found at %d location.", E, i);
break;
}
}
if (array[i] != E) {
printf("Element not found.");
}
}

