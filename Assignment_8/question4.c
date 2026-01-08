//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question4.c 
//  Description     : Accept number from user and display its table 
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
void DisplayTable(int iNo)
{ 
    int iCnt = 0;
    int iMult= 1;

    if (iNo < 0)
    {
        iNo = -iNo;
    }

    printf("your Table is \n");
    for(iCnt = 1 ; iCnt <= 10 ; iCnt++)
    {
        iMult = iCnt *iNo;
        printf("%d\n",iMult);
    }
}

int main()
{
   int iValue1 = 0 ;

   
   printf("Enter Your number\n");
   scanf("%d",&iValue1);

   DisplayTable(iValue1);
   
   return 0;


}