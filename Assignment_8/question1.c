//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name       :question1.c
//  Description     : Accept number from user and if it is 
//                   its less than 50 print small
//                   its greater than 50 & less than 100 print medium
//                   its greater than 100 than print large 
//  Author          : harshada anil patil
//  Date            : 22/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
void Number(int iNo)
{ 
  if ((iNo) <= 50)
  {
    printf("It is small ");
  }

  else if ((iNo > 50) && (iNo < 100))
  {
    printf("It is medium");
  }

   else
  {
    printf("It is large ");
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