////////////////////////////////////////////////////////////////////////////////
//
//  File name :     question5.c
//  Description :   Accept N numbers from user and display 
//                   summation of digits of each number
//  Author :        harshada patil
//  Date :          16/11/2025
//
////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

void DigitSum(int Arr[],int iLength)
{
    int iCnt=0;
    int iSum=0;
    int iNo=0;
    int iValue=0;
    
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        iNo=Arr[iCnt];

        iValue=0;
        
        while(iNo!=NULL)
        {
            iSum=iNo%10;
            iValue=iValue+iSum;
            iNo=iNo/10;
        }
       printf("%d ",iValue);
    }
       
}

int main()
{
    int iSize=0,iCnt=0;
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

    DigitSum(p,iSize);
   
    free(p);

    return 0;
}