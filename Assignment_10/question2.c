//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question2.c
//  Description     : Accept Width & Height of Rectangle and calculate its Area 
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
float RecArea (float Height,float Width)
{
   float fArea = 0.0f;
   fArea = Height * Width ;
   return fArea;
}

int main()
{
   float fValue1 = 0.0f ;
   float fValue2 = 0.0f ;
   double dRet = 0.0f;

   printf("Enter Height of Rectangle\n");
   scanf("%f",&fValue1);

   printf("Enter Width of Rectangle\n");
   scanf("%f",&fValue2);

  dRet = RecArea(fValue1,fValue2);

  printf("Area of Rectangle is : %lf ", dRet);

  return 0;


}