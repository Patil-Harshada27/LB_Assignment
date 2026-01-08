//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question5.c
//  Description     : Accept Distance in SquareFeet into Squaremeters
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
double SquareMeters (int iNo)
{
   double dSquareMeters = 0;
   dSquareMeters = iNo * 0.0929;
   return dSquareMeters;
}

int main()
{
   int  iValue = 0.0f ;
   
   double dRet = 0.0f;

   printf("Enter Distance in SquareFeet\n");
   scanf("%d",&iValue);

  dRet = SquareMeters(iValue);

  printf("%d SquareFeet is %lf Squaremeters",iValue,dRet);

  return 0;


}