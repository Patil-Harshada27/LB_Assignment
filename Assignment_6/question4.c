#include<stdio.h>
#include<stdbool.h>   // for bool, true, false

bool CheckEqual(int iNo1, int iNo2)
{
    if(iNo1 == iNo2)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    bool bRet = false;

    printf("please enter two numbers");
    scanf("%d %d,&ivalue1,&ivalue2");
   
    
    bRet = CheckEqual(iValue1, iValue2);

    if(bRet == true)
    {
        printf("Numbers are Equal\n");
    }
    else
    {
        printf("Numbers are Not Equal\n");
    }

    return 0;
}
