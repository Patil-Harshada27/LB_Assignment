
#include<stdio.h>

void DisplayConvert(char CValue)
{
    if((CValue >= 'A') && (CValue <= 'Z'))       
    {
        printf("%c", CValue + 32);             
    }
    else if((CValue >= 'a') && (CValue <= 'z'))  
    {
        printf("%c", CValue - 32);               
    }
    else
    {
        printf("Invalid input");
    }
}

int main()
{
    char CValue = '\0';

    printf("Enter character: ");
    scanf("%c", &CValue);    

    DisplayConvert(CValue);

    return 0;
}