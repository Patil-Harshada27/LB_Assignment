////////////////////////////////////////////////////////////////////////////////
//
//  File name :     question4.c
//  Description :   Accept  N numbers from user and accept Range Display
//                  all elements from that range
//  Author :        harshada anil patil
//  Date :          16/11/2025
//
//////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

void Range(int Arr[],int iLength,int iNo1,int iNo2)
{
    int iCnt=0;


    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        if((Arr[iCnt]>iNo1)&&(Arr[iCnt]<iNo2))
        {
            printf("%d  ",Arr[iCnt]);
        }
       
    }
    
}

int main()
{
    int iSize=0,iCnt=0,iValue1=0,iValue2=0;
    int *p=NULL;

    printf("Enter number of elements: ");
    scanf("%d",&iSize);

    printf("Enter Starting point: ");
    scanf("%d",&iValue1);
    printf("Enter Ending point: ");
    scanf("%d",&iValue2);

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

    Range(p,iSize,iValue1,iValue2);

   
    free(p);

    return 0;
}