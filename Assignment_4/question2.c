#include<stdio.h>

void FactRev(int iNo)
{
    int iFact =0;

    if(iNo <= 0)
    {
        iNo = - iNo;
    }
    for(iFact =iNo; iFact  >= 1; iFact --)
    {
        if((iNo % iFact)== 0)
        {
            printf("%d\t",iFact);
        }
    }
}
int main()
{
    int iValue =0;

    printf("Enter the number :");
    scanf("%d",&iValue);

    FactRev(iValue);

    return 0;
}