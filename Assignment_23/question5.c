////////////////////////////////////////////////////////////////////////////////
//
//  File name :     question5.c
//  Description :   Accept  N numbers from user and return product of
//                  all odd  elements 
//  Author :        harshada patil
//  Date :          16/11/2025
//
/////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int Product(int Arr[],int iLength)
{
    int iCnt=0;
    int iProduct=0;
    iProduct=1;


    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        if((Arr[iCnt]%2)!=0)
        {
           iProduct*=Arr[iCnt]; 
        }
       
    }
    return iProduct;
    
    
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

    iRet=Product(p,iSize);

    printf("%d\n",iRet);

   
    free(p);

    return 0;
}