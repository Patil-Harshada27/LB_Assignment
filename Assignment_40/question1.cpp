////////////////////////////////////////////////////////////
//
//  File name :     question1.cpp
//  Description :   This program displays '*' recursively
//                  a user-defined number of times 
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
//  Description   : Displays '*' recursively n times
//  Input         : int n (number of times to print '*')
//  Output        : void
//  Time Complexity : O(N) 
//
////////////////////////////////////////////////////////////
void Display(int iNo)
{
    static int iCnt = 0;  

    if (iCnt < iNo) 
    { 
        cout << "*\t";  
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
//  Input : 6
//  Output : *   *   *   *   *   *
//
//  Input : 3
//  Output : *   *   *
//
////////////////////////////////////////////////////////////