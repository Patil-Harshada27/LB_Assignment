//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question3.c 
//  Description     : Accept number from user and return Frequency of digits between 3 and 7 
//  Author          :harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountRange(int iNo)

{
   int iDigit = 0;
   int iCount = 0;

   if(iNo < 0)
   {
    iNo = -iNo;
   }

   while (iNo != 0)
   {
     iDigit = iNo % 10;
     if((iDigit >= 3) && (iDigit <= 7))
     {
       iCount ++ ;
     }
     iNo = iNo/ 10;
   }
   return iCount ;
}

int main()
{

    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

   iRet = CountRange(iValue);
   
   printf("Frequency of number between 3 and 7  is %d ",iRet);
   
    
}