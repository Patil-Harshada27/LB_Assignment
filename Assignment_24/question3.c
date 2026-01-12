/////////////////////////////////////////////////////////////////////////////////
//
//  File name :     question3.c
//  Description :   Accept N numbers from user and return the difference between
//                   largest and smallest number
//  Author :        harshada anil patil
//  Date :          16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[],int iLength)
{
    int iCnt=0;
    int iMax=0;
    int iMin=0;

    for(iMin=Arr[0],iMax=Arr[0],iCnt=0;iCnt<iLength;iCnt++)
    {
        if(Arr[iCnt]<iMin)
        {
           iMin=Arr[iCnt];
        }
        else if(Arr[iCnt]>iMax)
        {
            iMax=Arr[iCnt];
        }
       
    }
    return iMax-iMin;
    
    
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

    iRet=Difference(p,iSize);

    printf("Difference  is %d\n",iRet);

    free(p);

    return 0;
}