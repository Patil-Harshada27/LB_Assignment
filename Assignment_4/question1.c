#include<stdio.h>

int MulFact(int iNo)
{
    int iFact = 0;
    int iMulti = 1; 

    if (iNo <= 0)
    {
        iNo = -iNo;
    }

    for(iFact = 1; iFact <= iNo; iFact++)
    {
        if((iNo % iFact) == 0)
        {
            iMulti = iMulti * iFact;  
        }
    }

    return iMulti;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    iRet = MulFact(iValue);
    printf("%d",iRet);

    return 0;
}
