//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question5
//  Description     : Accept Total mark & Obtained marks from user and Calculate percentage
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
float CalculatePercentage(float iTotalMarks,float iObtainedMarks)

{
   float fper = 0.0f;

   fper = (iObtainedMarks/ iTotalMarks)*100;

   return fper;
}
int main()
{
   int iValue1 = 0 ;
   int iValue2 = 0 ;
 

  float  fRet = 0;

   printf("Enter Total Marks\n");
   scanf("%d",&iValue1);

   printf("Enter Obtained Marks\n");
   scanf("%d",&iValue2);

   

   fRet = CalculatePercentage(iValue1,iValue2);

   printf("Your Precentage is %f",fRet);

   return 0;
}