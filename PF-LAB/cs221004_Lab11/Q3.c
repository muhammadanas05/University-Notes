#include <stdio.h>

int main() {
  char sentence[1000];
  FILE *inputFile;

  inputFile = fopen("output.txt", "r");

  if (inputFile == NULL) {
    printf("File not found\n");
    return 1;
  }

  while (fgets(sentence, sizeof(sentence), inputFile) != NULL) {
    printf("%s", sentence);
  }

  fclose(inputFile);

  return 0;
}
