////////////////////////////////////////////////////////////
//
//  File name :     question4.cpp
//  Description :   This program displays characters recursively
//                  from 'A' to user-defined character
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
//  Description   : Displays characters recursively from 'A' 
//                  to user-defined character
//  Input         : None
//  Output        : void
//  Time Complexity : O(N) 
//
////////////////////////////////////////////////////////////
void Display(char endC)
{
    static char ch = 'A';  

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
//  Input : E
//  Output : A   B   C   D   E
//
//  Input : C
//  Output : A   B   C
//
////////////////////////////////////////////////////////////