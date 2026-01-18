////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   Program to display ASCII table (0–255)
//  Author :        Harshada Patil
//  Date :          05/12/2025
//
////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////
//
//  REQUIRED PACKAGES
//
////////////////////////////////////////////////////////////

import java.util.*;

class DisplayX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayASCII
    //  Description :   Displays ASCII values with characters
    //  Input :         void
    //  Output :        void
    //
    ////////////////////////////////////////////////////////////
    public void DisplayASCII()
    {
        System.out.println("ASCII Table (0 to 255):");

        int iCnt = 0;
        for(iCnt = 0; iCnt <= 255; iCnt++)
        {
            char ch = (char)iCnt;
            System.out.println(iCnt + "  ->  " + ch);
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////

class one
{
    public static void main(String args[])
    {
        DisplayX dobj = new DisplayX();
        dobj.DisplayASCII();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Sample Output :
//  32  ->  ' '
//  48  ->  0
//  65  ->  A
//  97  ->  a
//  128 ->  Ç  
//  255 ->  ÿ
//
////////////////////////////////////////////////////////////