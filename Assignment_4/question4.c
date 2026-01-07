#include<stdio.h>

int sumNonFact(int iNo)
{
    int iFact =0;
    int iSum =0;

    if(iNo<=0)
    {
        iNo = -iNo;
    }
    for(iFact=1; iFact<=iNo; iFact++)
    {
        if((iNo % iFact)!=0)
        {
            iSum=iSum +iFact;
        }
    }
    return iSum;
}
int main()
{
    int iValue =0;
    int iRet =0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = sumNonFact(iValue);
    printf("sumation is :%d",iRet);

    return 0;
}