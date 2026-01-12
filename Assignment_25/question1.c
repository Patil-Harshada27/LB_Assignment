////////////////////////////////////////////////////////////////////////////////
//
//  File name :     question1.c
//  Description :   Accept N numbers from user and return difference between summation
//                  of even elements and summation of odd elements
//  Author :        harshada anil patil
//  Date :          16/11/2025
//
///////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int  Differnce(int Arr[],int iLength)
{
    int iCnt=0;
    int iFrequency1=0;
    int iFrequency2=0;
    
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        if((Arr[iCnt]%2)==0)
        {
            iFrequency1+=Arr[iCnt];
        }
        else if((Arr[iCnt]%2)!=0)
        {
            iFrequency2+=Arr[iCnt];
        }
    }
    return iFrequency1-iFrequency2;
    
}

int main()
{
    int iSize=0,iCnt=0,iRet=0;
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

    iRet=Differnce(p,iSize);

    printf("Result is %d\n",iRet);

   
    free(p);

    return 0;
}