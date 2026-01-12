//////////////////////////////////////////////////////////////////
//
//  File name :     question3.c
//  Description :   Accept  N numbers from user and check 
//                  whether that number contains 11 in it or not
//  Author :        harshada patil
//  Date :          16/11/2025
//
///////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>


bool Check(int Arr[],int iLength)
{
    int iCnt=0;
    int iFrequency=0;
    bool bFlag=false;

    for(iCnt =0 ;iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt]==11)
        {
            bFlag=true;
            break;
        }
    }
    return bFlag;
}

int main()
{
    int iSize=0,iCnt=0;
    int *p=NULL;
    bool bRet=false;

    printf("Enter number of Elements\n");
    scanf("%d",&iSize);

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
    bRet=Check(p,iSize);

    if(bRet==true)
    {
        printf("11 is present");

    }
    else
    {
        printf("11 is Absent");
    }
    free(p);
   
    return 0;

}