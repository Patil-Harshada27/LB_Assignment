//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question1.c
//  Description     : Accept number from user and print factors of that number 
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Print_Factor( int iNo)

{
   if (iNo <= 0)
   {
     return;
   }

   int iCnt = 0 ;
   
   for (iCnt = 1; iCnt <= iNo/2 ; iCnt++)
   { 
      if((iNo % iCnt)==0) 
    {
       printf("%d\t",iCnt);
    }
   }
}

int main()
{

    int iValue = 0;

    printf("Enter your number\n");
    scanf("%d",&iValue);

    Print_Factor(iValue);


    return 0;
}