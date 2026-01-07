/////////////////////////////////////////////////////////////////
// 
//  Required Header files
//
/////////////////////////////////////////////////////////////////

#include<stdio.h>
/////////////////////////////////////////////////////////////////
//
//  Function Name : Divide
//  Description :   It is used to perform Division         
//  Input :         integer,integer
//  Output :        integer
//  Author :        harshada anil patil
//  Date :          20/10/2025
//
/////////////////////////////////////////////////////////////////

int  Divide(int iNo, int iNo2)
{
    int iAns = 0;
    if(iNo2 == 0 )
    {
        return -1;
    }
   
    iAns =iNo2;
    return iAns;
}
int main ()
{
    int iValue1= 15,iValue2 =5;
    int iRet =0;

    iRet = Divide( iValue1 , iValue2);
    printf("Divide is %d",iRet);

    return 0;
}