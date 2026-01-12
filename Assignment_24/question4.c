////////////////////////////////////////////////////////////////////////////////
//
//  File name :     question4.c
//  Description :   Accept N numbers from user and display all such numbers 
//                  which contains 3 digits in it
//  Author :        harshada patil
//  Date :          16/11/2025
//
///////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[],int iLength)
{
    int iCnt=0;
    
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
      if((Arr[iCnt]>=100)&&(Arr[iCnt]<=999))
      {
        printf("%d ",Arr[iCnt]);
      }
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

    Digits(p,iSize);
    
    free(p);

    return 0;
}