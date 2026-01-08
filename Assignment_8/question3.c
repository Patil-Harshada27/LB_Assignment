//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question3.c
//  Description     : Accept number from user and find its factorial
//  Author          : harshada anil patil 
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
int Factorial(int iNo)
{ 
    int iCnt = 0;
    int iFact= 0;

    if (iNo < 0)
    {
        iNo = -iNo;
    }

    iFact = 1;
    for (iCnt = 1; iCnt <= iNo ; iCnt ++)
    {
        iFact = iFact * iCnt;
       
    }
    return iFact;
}
int main()
{
   int iValue1 = 0 ;
      int iRet = 0 ;
   
   printf("Enter Your number\n");
   scanf("%d",&iValue1);

   iRet = Factorial(iValue1);
 
   printf("Factorial of %d is %d",iValue1,iRet);

  return 0;


}