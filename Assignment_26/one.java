////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   This program displays alphabets from A
//                  up to the number of elements entered
//                  by the user (A, B, C, ...)
//  Author :        Harshada Anil Patil
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

/*
    INPUT:
        5

    OUTPUT:
        A   B   C   D   E
*/

import java.util.Scanner;


class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Displays alphabets starting from 'A'
    //                  according to the given number
    //  Input :         int iNo
    //  Output :        Void
    //
    ////////////////////////////////////////////////////////////
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < iNo; iCnt++)
        {
            System.out.printf("%c\t",('A' + iCnt));
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
// 
/////////////////////////////////////////////////////////////
public class one
{
    
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Frequency:");
        int iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases
//
////////////////////////////////////////////////////////////
//
//  Input : 1
//  Output :
//          A
//
// ------------------------------------------
//
//  Input : 3
//  Output :
//          A   B   C
//
// ------------------------------------------
//
//  Input : 5
//  Output :
//          A   B   C   D   E
//
// ------------------------------------------
//
//  Input : 10
//  Output :
//          A   B   C   D   E   F   G   H   I   J
//
// ------------------------------------------
//
//  Input : 0
//  Output :
//          (No output)
//
// ------------------------------------------
//
//  Input : -4
//  Output :
//          (No output)
//
//
////////////////////////////////////////////////////////////