//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question2.c
//  Description     : Accept number from user and return Frequency of odd digits in it
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountOddFrequency(int iNo)

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
     if((iDigit % 2)!=0)
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

   iRet = CountOddFrequency(iValue);
   
     printf("Frequency of odd digits is %d ",iRet);
   
    
}