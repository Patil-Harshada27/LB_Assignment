////////////////////////////////////////////////////////////
//
//  File name :     question5.cpp
//  Description :   This program displays characters recursively
//                  from 'a' to user-defined character
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
//  Description   : Displays characters recursively from 'a' 
//                  to user-defined character
//  Input         : character
//  Output        : void
//  Time Complexity : O(N) 
//
////////////////////////////////////////////////////////////
void Display(char endC)
{
    static char ch = 'a';  

    if (ch <= endC)          
    {
        cout << ch << "\t"; 
        ch++;               
        Display(endC);          
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////
int main()
{
    char cValue;

    cout << "Enter last character: ";
    cin >> cValue;

    Display(cValue); 
    cout << "\n";

    return 0;
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : e
//  Output : a  b   c   d   e
//
//  Input : c
//  Output : a   b   c
//
////////////////////////////////////////////////////////////