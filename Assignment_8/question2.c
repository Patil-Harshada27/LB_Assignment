//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       : question2.c
//  Description     : Accept number from user and print it into words
//  Author          : harshada anil patil 
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
void Number(int iNo)
{ 
 if (iNo < 0)
 {
    iNo = -iNo;
 }

 if(iNo >= 10)
 {
    printf("Invalid Numbers\n");
 }

 if (iNo == 0)
 {
    printf("Zero\n");
 }

 else if (iNo == 1)
 {
    printf("One\n");
 }

 else if (iNo == 2)
 {
    printf("Two\n");
 }

 else if (iNo == 3)
 {
    printf("Three\n");
 }

 else if (iNo == 4)
 {
    printf("Four\n");
 }

 else if (iNo == 5)
 {
    printf("Five\n");
 }

 else if (iNo == 6)
 {
    printf("Six\n");
 }

 else if (iNo == 7)
 {
    printf("Seven\n");
 }

 else if (iNo == 8)
 {
    printf("Eight\n");
 }

 else if (iNo == 9)
 {
    printf("Nine\n");
 }
}
int main()
{
   int iValue1 = 0 ;
   
   printf("Enter Your number\n");
   scanf("%d",&iValue1);

  Number(iValue1);

  return 0;


}