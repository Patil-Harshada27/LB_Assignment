//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question4.c
//  Description     : Accept number from user and return multiplication of its digits 
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int MultDigits(int iNo)

{
   int iDigit = 0;
   int iMult = 0;


   if(iNo < 0)
   {
    iNo = -iNo;
   }


   iMult = 1;
   while (iNo != 0)
   {
     iDigit = iNo % 10 ;
     {

     if(iDigit != 0)
     
     {
        iMult  = iMult * iDigit;
     }
     }

        iNo = iNo /10;
}
return iMult;
}

int main()
{

    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

   iRet = MultDigits(iValue);
   
   printf("Multiplication of digits is  %d ",iRet);
   
    
}