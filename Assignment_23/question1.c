////////////////////////////////////////////////////////////////////////
//
//  File name :     question1.c
//  Description :   Accept  N numbers from user and accept one another
//                  number as no check whether no is present or not
//  Author :        harshada patil
//  Date :          16/11/2025
//
////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
#define TRUE 1
#define FALSE 0
typedef int Bool;


bool Check(int Arr[],int iLength,int iNo)
{
    int iCnt=0;


    for(iCnt =0 ;iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt]==iNo)
        {
           return TRUE;
        }
    }
    return FALSE;
}

int main()
{
    int iSize=0,iCnt=0,iValue=0,iRet=0;
    int *p=NULL;
    Bool bRet=false;

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
    bRet=Check(p,iSize,iValue);

    if(bRet==true)
    {
        printf("NO is present");

    }
    else
    {
        printf("No is  Absent");
    }
    free(p);
   
    return 0;

}