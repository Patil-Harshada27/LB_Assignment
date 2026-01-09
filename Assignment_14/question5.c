//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question5.c
//  Description     : Accept number from user and return Frequency of  numbers less than 6 in it
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountFrequency(int iNo)

{
   int iDigit = 0;
   int iCount = 0;

   while (iNo != 0)
   {
     iDigit = iNo % 10;

     if(iDigit <= 6)
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

   iRet = CountFrequency(iValue);
   
     printf("Frequency of 6 is %d ",iRet);
   
    
}