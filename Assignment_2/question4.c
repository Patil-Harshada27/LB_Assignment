#include<stdio.h>

void Display(  int  iNo, int iFrequency)
{
    int iCnt = 0;
    // write updater
    if (iFrequency<0)
    {
        iFrequency = 3;
    }

    for(iCnt = 1; iCnt =iFrequency ; iCnt ++)
    {
        printf(" %d", iNo);

    }
}
int main()
{
    int iValue =0;
    int icount =0;

    printf("Enter number ");
    scanf("%d",&iValue);

     printf("Enter frequency");
     scanf("%d",&icount);

    Display( iValue, icount);
    return 0;

}