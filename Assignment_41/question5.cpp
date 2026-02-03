
////////////////////////////////////////////////////////////
//
//  File name :    question5.cpp
//  Description :   This program returns product of digits
//                  of a number recursively
//  Author :        Harshada Patil
//  Date :          05/12/2025
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
//  Function Name : Mult
//  Description   : Returns product of digits recursively
//  Input         : Integer
//  Output        : Integer
//  Time Complexity : O(N)
//
////////////////////////////////////////////////////////////
int MultiplyDigits(int iNo)
{
    int iDigit = 0;
    int iRemain = 0;
    int iMult = 0;
    int iResult = 0;
    
    if (iNo < 0)
    {
        iNo = -iNo;
    }

    if (iNo == 0)
    {
        return 1;
    }

    iDigit = iNo % 10;
    iRemain = iNo / 10;

    iMult= MultiplyDigits(iRemain);
    iResult = iDigit * iMult;

    return iResult;
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0, iRet = 0;

    cout << "Enter number: ";
    cin >> iValue;

    iRet = MultiplyDigits(iValue);

    cout << iRet << "\n";

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : 123
//  Output : 6
//
//  Input : 456
//  Output : 120
//
////////////////////////////////////////////////////////////