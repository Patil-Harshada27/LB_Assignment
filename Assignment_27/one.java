////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   This program displays a pattern of '*'
//                  with iRow rows and iCol columns.
//  Author :        Harshada Anil patil
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

/*
    INPUT  : iRow = 3,  iCol = 4

    OUTPUT : 
              *   *   *   *
              *   *   *   *
              *   *   *   *
*/

import java.util.Scanner;

class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Displays a star pattern with iRow rows
    //                  and iCol columns.
    //  Input :         int iRow, int iCol
    //  Output :        Void
    //
    ////////////////////////////////////////////////////////////
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.printf("*\t");
            }
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
public class one
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows:");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns:");
        int iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases
//
////////////////////////////////////////////////////////////
//
//  Input : iRow = 1, iCol = 1
//  Output :
//          *
//
// ---------------------------------------------
//
//  Input : iRow = 1, iCol = 5
//  Output :
//          *   *   *   *   *
//
// ---------------------------------------------
//
//  Input : iRow = 3, iCol = 4
//  Output :
//          *   *   *   *
//          *   *   *   *
//          *   *   *   *
//
// ---------------------------------------------
//
//  Input : iRow = 4, iCol = 2
//  Output :
//          *   *
//          *   *
//          *   *
//          *   *
//
// ---------------------------------------------
//
//  Input : iRow = 0, iCol = 5
//  Output :
//          (No output)
//
// ---------------------------------------------
//
//  Input : iRow = -3, iCol = 4
//  Output :
//          (No output)
//
////////////////////////////////////////////////////////////