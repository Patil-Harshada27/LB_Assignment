////////////////////////////////////////////////////////////
//
//  File name :     two.java
//  Description :   This program displays numbers in reverse
//                  order along with '#' symbol.
//  Author :        Harshada anil patil
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

/*
    INPUT:
        5

    OUTPUT:
        5   #   4   #   3   #   2   #   1   #
*/

import java.util.Scanner;

class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Displays numbers in reverse order
    //                  separated by '#'
    //  Input :         int iNo
    //  Output :        Void
    //
    ////////////////////////////////////////////////////////////
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt + "\t#\t");
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
public class two
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
//          1   #
//
// ---------------------------------------------
//
//  Input : 3
//  Output :
//          3   #   2   #   1   #
//
// ---------------------------------------------
//
//  Input : 5
//  Output :
//          5   #   4   #   3   #   2   #   1   #
//
// ---------------------------------------------
//
//  Input : 10
//  Output :
//          10  #   9   #   8   #   7   #   6   #   5   #   4   #   3   #   2   #   1   #
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
//
////////////////////////////////////////////////////////////