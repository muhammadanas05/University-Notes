#include <stdio.h>
#include <ctype.h>

int main() {
  char sentence[1000];
  int i;
  FILE *outputFile;

  printf("Enter a sentence: ");
  fgets(sentence, sizeof(sentence), stdin);

  outputFile = fopen("output.txt", "w");

  for (i = 0; sentence[i]; i++) {
    if (sentence[i] == ' ' || sentence[i + 1] == '\0') {
      sentence[i + 1] = toupper(sentence[i + 1]);
    }
  }

  fprintf(outputFile, "%s", sentence);

  fclose(outputFile);

  return 0;
}
