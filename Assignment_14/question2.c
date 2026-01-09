//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question2.c
//  Description     : Accept number from user and check if it contains zero in it or not
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

#define True 1
#define False 0
bool  CheckZero(int iNo)

{
   int iDigit = 0;
   while (iNo != 0)
   {
     iDigit = iNo % 10;
     if(iDigit == 0)
     {
        return True;
     }
     iNo = iNo/ 10;
   }
   return False ;
}

int main()
{

    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

   iRet = CheckZero(iValue);
   if(iRet == True)
   {
    printf("It contains Zero\n");
   }
   else
   {
     printf("It doesnt contains Zero\n ");
   }
    
}