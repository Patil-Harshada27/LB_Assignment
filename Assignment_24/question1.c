/////////////////////////////////////////////////////////////////////////////////
//
//  File name :      question1.c
//  Description :   Accept N numbers from user and return the largest number
//  Author :        harshada patil
//  Date :          16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Maximum(int Arr[],int iLength)
{
    int iCnt=0;
    int iMax=0;

    for(iMax=Arr[0],iCnt=0;iCnt<iLength;iCnt++)
    {
        if(Arr[iCnt]>iMax)
        {
           iMax=Arr[iCnt];
        }
       
    }
    return iMax; 
    
}

int main()
{
    int iSize=0,iRet=0,iCnt=0;
    int *p=NULL;

    printf("Enter number of elements: ");
    scanf("%d",&iSize);


    p=(int*)malloc(iSize*sizeof(int));

    if(p==NULL)
    {
        printf("Unable to allocate the memory ");
        return -1;
    }

    printf("Enter %d elements ",iSize);

    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        printf("Enter elements %d :\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    iRet=Maximum(p,iSize);

    printf("Maximum number is %d\n",iRet);

   
    free(p);

    return 0;
}