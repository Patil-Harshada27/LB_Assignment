/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question5.c
//  Description     : Accept number from user and return the difference between sum of its even digits and odd digits
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int SumDiff(int iNo)

{
   int iDigit = 0;
   int iSum1  = 0;
   int iSum2 = 0;


   if(iNo < 0)
   {
    iNo = -iNo;
   }

   while (iNo != 0)
   {
      iDigit = iNo % 10;

    {
      if((iDigit % 2)==0)
      {
        iSum1 = iSum2 +iDigit;
      }

      if((iDigit % 2)!=0)
      {
        iSum2 = iSum2 +iDigit;
      } 
    }
    iNo = iNo / 10 ;
  }

   return (iSum1 - iSum2);
}

int main()
{

    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

   iRet = SumDiff(iValue);
   
   printf("sum of even digits and odd digits  %d ",iRet);
   
    
}