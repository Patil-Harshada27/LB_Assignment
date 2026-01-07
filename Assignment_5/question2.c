#include<stdio.h>

 int FindMax(int a, int b)
 {
    int iResult;
    if(a>b)
    {
        iResult = a;
    }
    else{
        iResult = b;
    }
    return iResult;
 }
 int main()
 {
    int num1 ,num2, result;
    printf("Enter two numbers :");
    scanf("%d %d",&num1,&num2);

    result=FindMax(num1,num2);
    printf("Maximum is :%d\n",result);

    return 0;
 }