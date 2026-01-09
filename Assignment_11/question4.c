
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question4.c
//  Description     : Accept Range from user and print the sum of all even numbers in that range 
//  Author          : harshada anil patil
//  Date            : 31/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int RangeSumEven(iNo1,iNo2)

{
    int iCnt = 0 ;
    int iSum = 0 ;


    if (iNo1 < 0 )
    {
        printf("Invalid Range");
        return -1 ;

    }

     if (iNo2 < 0 )
    {
        printf("Invalid Range");
        return -1 ;

    }

     if (iNo1 > iNo2 )
    {
        printf("Invalid Range");
        return -1 ;

    }

    for (iCnt = iNo1 ; iCnt <= iNo2 ; iCnt++)
    {
        if((iCnt % 2 )== 0)
        {
        iSum = iSum + iCnt;
        }
    }
    
    return iSum;

}

int main()
{

    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;


    printf("Enter your starting number\n");
    scanf("%d",&iValue1);

    printf("Enter your Ending number\n");
    scanf("%d",&iValue2);

    iRet = RangeSumEven(iValue1,iValue2);

    if (iRet != -1)
      {
        printf("%d is Sum of even number in  the range\n",iRet);

      }

    return 0;
}