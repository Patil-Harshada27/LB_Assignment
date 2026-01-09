//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question1.c
//  Description     : Accept number from user and Display Digits in Reverse order
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int DisplayDigits(int iNo)


{
   int iDigit = 0;
   while (iNo != 0)
   {
     iDigit = iNo % 10;
     iNo = iNo/ 10;
     printf("%d",iDigit);
   }
   
}

int main()
{

    int iValue = 0;
    int iRet = 0;




    printf("Enter Number : ");
    scanf("%d",&iValue);

    DisplayDigits(iValue);
    
    return 0;
}