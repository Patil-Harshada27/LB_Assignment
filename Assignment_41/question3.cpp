////////////////////////////////////////////////////////////
//
//  File name :   question3.cpp
//  Description :   This program counts characters in a string
//                  recursively
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
//  Function Name : StrlenX
//  Description   : Returns length of string recursively
//  Input         : Character array
//  Output        : Integer
//  Time Complexity : O(N)
//
////////////////////////////////////////////////////////////
int StrlenX(char *str)
{
    int iCount = 0;
    if (*str == '\0')
    {
        return 0;
    }

    iCount = 1;                  
    
    iCount = iCount + StrlenX(str + 1);

    return iCount;
}


////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////
int main()
{
    char arr[20];
    int iRet;

    cout << "Enter string: ";
    cin >> arr;

    iRet = StrlenX(arr);

    cout << iRet << "\n";

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello
//  Output : 5
//
//  Input : Cpp
//  Output : 3
//
////////////////////////////////////////////////////////////