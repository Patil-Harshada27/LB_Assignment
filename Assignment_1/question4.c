#include<stdio.h>
#include<stdbool.h>

     bool check(int iNo)
{
    if(( iNo %5)==0)
    {
        return true;
    }
    else
    {
        return false ;
    }
}
int main()
{
    int iValue = 0;
    bool bRet = false;
    printf("Enter the number");
    scanf("%d",& iValue);

    bRet = check(iValue);

    if(bRet==true)
    {
        printf("Divisible by 5");

    }
    else
    {
        printf("Not Divisible by 5\n");
    }

    return 0;
}