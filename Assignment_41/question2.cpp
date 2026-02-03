////////////////////////////////////////////////////////////
//
//  File name   : question2.cpp
//  Description : To calculate sum of digits of a number 
//                recursively
//  Author      :Harshada Patil
//  Date        : 05/12/2025
//
////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////
//
//  REQUIRED HEADER FILES
//
////////////////////////////////////////////////////////////

#include <iostream>
using namespace std;

////////////////////////////////////////////////////////////
//
//  Function Name : Sum
//  Description   : Returns sum of digits recursively
//  Input         : int 
//  Output        : int
//  Author        : Harshada patil
//  Date          : 05/12/2025
//  Time Complexity : O(N)  
//
////////////////////////////////////////////////////////////

int Sum(int iNo)
{
    int iDigit = 0;
    int iRemaining = 0;
    int iSum = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(iNo == 0)
    {
        return 0;
    }

    iDigit = iNo % 10;        
    iRemaining = iNo / 10;    

    iSum = iDigit;           

    iSum = iSum + Sum(iRemaining);   

    return iSum;
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0, iRet = 0;

    cout << "Enter Number : ";
    cin >> iValue;

    iRet = Sum(iValue);

    cout << "Sum of digits is : " << iRet << "\n";

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by the application
//
//  Input : 7521  
//  Output : Sum of digits is : 15
//
//  Input : 903
//  Output : Sum of digits is : 12
//
//  Input : -456
//  Output : Sum of digits is : 15
//
////////////////////////////////////////////////////////////