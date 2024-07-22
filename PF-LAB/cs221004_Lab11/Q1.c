#include <stdio.h>

int main() {
  int i, num;
  FILE *evenFile, *oddFile;

  evenFile = fopen("evenNumbers.txt", "w");
  oddFile = fopen("oddNumbers.txt", "w");

  for (i = 0; i < 10; i++) {
    printf("Enter a number: ");
    scanf("%d", &num);

    if (num % 2 == 0) {
      fprintf(evenFile, "%d\n", num);
    } else {
      fprintf(oddFile, "%d\n", num);
    }
  }

  fclose(evenFile);
  fclose(oddFile);

  return 0;
}
