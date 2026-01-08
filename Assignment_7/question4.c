//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question4.c
//  Description     : Accept one number from user and print all odd numbers till that number
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
void  OddDisplay( iNo)
{ 

    int iCnt = 0;

    if(iNo < 0)
    {
       iNo = -iNo;
    }

    for (iCnt = 1 ; iCnt <= iNo ; iCnt ++)
    {
        if((iCnt % 2 )!= 0)
        {
           printf("%d\t",iCnt);
        }
    }
}
int main()
{
   int iValue = 0 ;
   
   printf("Enter Your number\n");
   scanf("%d",&iValue);

   OddDisplay(iValue);

  return 0;


}