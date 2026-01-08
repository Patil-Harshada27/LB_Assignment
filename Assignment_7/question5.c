//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question5.c
//  Description     : Accept one number from user and print 5 multiples of that number
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
void  DisplayMultiples(iNo)
{ 

    int iCnt = 0;
    int iMult = 1;

    if(iNo < 0)
    {
       iNo = -iNo;
    }

    for (iCnt = 1 ; iCnt <= 5 ; iCnt ++)
    {

           iMult=iCnt *iNo;
           printf("%d\t",iMult);
        
    }
}
int main()
{
   int iValue = 0 ;
   
   printf("Enter Your number\n");
   scanf("%d",&iValue);

   DisplayMultiples(iValue);

  return 0;


}