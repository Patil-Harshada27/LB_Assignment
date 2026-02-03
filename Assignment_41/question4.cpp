////////////////////////////////////////////////////////////
//
//  File name :     question4.cpp
//  Description :   This program returns factorial of a number
//                  recursively
//  Author :       Harshada Patil
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
//  Function Name : Fact
//  Description   : Returns factorial recursively
//  Input         : Integer
//  Output        : Integer
//  Time Complexity : O(N)
//
////////////////////////////////////////////////////////////
int Factorial(int iNo)
{
    
    int iCValue = 0;
    int iRValue = 0;
    int iResult = 0;
    
    if (iNo <= 1)
    {
        return 1;
    }


    iCValue = iNo;           
    iRValue = Factorial(iNo - 1); 
    
    iResult = iCValue* iRValue; 
    
    return iResult;  
}


////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////
int main()
{
    int iValue, iRet;

    cout << "Enter number: ";
    cin >> iValue;

    iRet = Factorial(iValue);

    cout << iRet << "\n";

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : 5
//  Output : 120
//
//  Input : 3
//  Output : 6
//
////////////////////////////////////////////////////////////