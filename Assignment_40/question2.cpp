////////////////////////////////////////////////////////////
//
//  File name :     question2.cpp
//  Description :   This program displays numbers recursively
//                  from 1 up to user-defined number
//  Author :        Harshada patil
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
//  Function Name : Display
//  Description   : Displays numbers recursively from 1 to n
//  Input         : None
//  Output        : void
//  Time Complexity : O(N) 
//
////////////////////////////////////////////////////////////
void Display(int iNo)
{
    static int iCnt = 1;  

    if (iCnt <= iNo)  
    { 
        cout << iCnt << "\t";  
        iCnt++;              
        Display(iNo);             
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;

    cout << "Enter number : ";
    cin >> iValue;

    Display(iValue); 
    cout << "\n";

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : 5
//  Output : 1   2   3   4   5
//
//  Input : 3
//  Output : 1   2   3
//
////////////////////////////////////////////////////////////