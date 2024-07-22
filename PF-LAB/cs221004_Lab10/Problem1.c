#include <stdio.h>
int main()
{
    char S1[100], S2[100];
    int i=0;

    printf("Enter Source String : ");
    gets(S1);

    while(S1[i] != '\0')
    {
        S2[i] = S1[i];
        i++;
    }

    S2[i] = '\0';

    printf("Destination String : %s", S2);

    return 0;
}
