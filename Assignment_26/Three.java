////////////////////////////////////////////////////////////
//
//  File name :     three.java
//  Description :   This program displays numbers from 1 to
//                  the entered value, each followed by '*'
//  Author :        Harshada anil patil 
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

/*
    INPUT  : 5
    OUTPUT : 1   *   2   *   3   *   4   *   5   *
*/

import java.util.Scanner;


class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Displays numbers from 1 to iNo,
    //                  each separated by '*'
    //  Input :         int iNo
    //  Output :        Void
    //
    ////////////////////////////////////////////////////////////
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%d\t*\t", iCnt);
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
public class three
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
//          1   *
//
// ---------------------------------------------
//
//  Input : 3
//  Output :
//          1   *   2   *   3   *
//
// ---------------------------------------------
//
//  Input : 5
//  Output :
//          1   *   2   *   3   *   4   *   5   *
//
// ---------------------------------------------
//
//  Input : 7
//  Output :
//          1   *   2   *   3   *   4   *   5   *   6   *   7   *
//
// ---------------------------------------------
//
//  Input : 0
//  Output :
//          (No output)
//
// ---------------------------------------------
//
//  Input : -4
//  Output :
//          (No output)
//
////////////////////////////////////////////////////////////