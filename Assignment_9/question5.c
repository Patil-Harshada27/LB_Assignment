//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question5.c
//  Description     : Accept number from user and return its  difference between even and odd factorial
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
int DiffFactorial(int iNo)
{ 
    int iCnt = 0;
    int iFact1= 0;
    int iFact2= 0;


    if (iNo < 0)
    {
        iNo = -iNo;
    }

    iFact1 = 1;
    iFact2 = 1;


    for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
       if ((iCnt % 2)==0)
       {
          iFact1 = iFact1 * iCnt;
       }
       else
       {
          iFact2 = iFact2 * iCnt;
       }
    }
    return( iFact1 - iFact2);

}

int main()
{
   int iValue1 = 0 ;
   int iRet = 0 ;

   printf("Enter Your number\n");
   scanf("%d",&iValue1);

  iRet = DiffFactorial(iValue1);

  printf("Difference between  Even & Odd Factorial of %d is %d ", iValue1,iRet);

  return 0;


}