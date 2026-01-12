//////////////////////////////////////////////////////////////////
//
//  File name :     question4.c
//  Description :   Accept  N numbers from user and return frequency 
//                  of 11 from it
//  Author :        harshada anil patil
//  Date :          16/11/2025
//
///////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength)
{
    int iCnt=0;
    int iFrequency=0;
    

    for(iCnt =0 ;iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt]==11)
        {
           iFrequency++;
        }
    }
    return iFrequency ;
}

int main()
{
    int iSize=0,iCnt=0,iRet=0;
    int *p=NULL;
    

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

    iRet=Frequency(p,iSize);
    printf("%d",iRet);

    free(p);
   
    return 0;

}