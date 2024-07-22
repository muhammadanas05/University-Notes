#include <stdio.h>
int main(){
	int WS;
	printf("ENTER WIND SPEED: ");
	scanf("%d",&WS);
	if(WS<25)
	 {printf("Not a strong wind");
	 }
	else if(25<=WS && WS<=38)
	{printf("Strong wind");
	}
	else if(39<=WS && WS<=54)
	{printf("Gale");
	}
	else if(55<=WS && WS<=72)
	{printf("Whole gale");
	}
	else if(WS>=72)
	{printf("Hurricane");
	}
	else{
		printf("Invalid value");
	}
	return 0;
}
