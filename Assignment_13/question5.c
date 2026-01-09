//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question5.c
//  Description     : Accept number from user and print sum of even  numbers till that number on screen
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int Sum_Of_Number(int ilimit)


{
   if (ilimit <= 0)
   {
     return;
   }

   int iCnt = 0 ;
   int iSum = 0 ;

   
   for (iCnt = 1; iCnt <= ilimit ; iCnt++)
   { 
     if((iCnt % 2)== 0)
     {
        iSum = iSum + iCnt;
     }
   }
   return iSum;
}

int main()
{

    int iLimit = 0;
    int iRet = 0;

    printf("Enter your limit\n");
    scanf("%d",&iLimit);

    iRet = Sum_Of_Number(iLimit);
    printf("Sum of Even numbers is %d\n",iRet);

    return 0;
}