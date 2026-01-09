//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question1.c
//  Description     : Accept Range from user and print  all numbers in between that range on screen
//  Author          :harshada anil patil 
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void RangeDisplay(iNo1,iNo2)
{
    int iCnt = 0 ;

    if (iNo1 > iNo2)
    {
        printf("Invalid Range");

    }

    for (iCnt = iNo1 ; iCnt <= iNo2 ; iCnt++)
    {
        printf("%d\t ", iCnt);
    }
}

int main()
{

    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter your starting number\n");
    scanf("%d",&iValue1);

    printf("Enter your Ending number\n");
    scanf("%d",&iValue2);

    RangeDisplay(iValue1,iValue2);


    return 0;
}