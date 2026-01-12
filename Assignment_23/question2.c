////////////////////////////////////////////////////////////////////////////////
//
//  File name :     question2.c
//  Description :   Accept  N numbers from user and accept one another number
//                  as No,return index of first occurence of that NO
//  Author :        harshada patil
//  Date :          16/11/2025
//
//////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int FirstOcc(int Arr[],int iLength,int iNo)
{
    int iCnt=0;
    int iFrequency=0;
    

    for(iCnt =0 ;iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt]==iNo)
        {
           return iCnt;
        }
    }
    return -1 ;
}

int main()
{
    int iSize=0,iCnt=0,iRet=0,iValue;
    int *p=NULL;
    

    printf("Enter number of Elements\n");
    scanf("%d",&iSize);

    printf("Enter the  number\n");
    scanf("%d",&iValue);

    p=(int*)malloc(iSize *sizeof(int));

    if(p==NULL)
    {
        printf("Unable to allocte memory");
        return -1;

    }
    printf("Enter %d elements:\n",iSize);

    for(iCnt=0 ;iCnt < iSize ; iCnt++)
    {
        printf("Enter element:%d",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    iRet=FirstOcc(p,iSize,iValue);
    
    if(iRet==-1)
    {
        printf("There is no such number\n");

    }
    else
    {
        printf("First Ocurrence of number is %d\n",iRet);

    }

    free(p);
   
    return 0;

}