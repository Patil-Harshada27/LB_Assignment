////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   This program displays a pattern where
//                  '*' is printed on and below the diagonal,
//                  and '#' is printed above the diagonal.
//  Author :      Harshada patil
//  Date :          22/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name :  Display
    //  Description :    Prints '*' on/below diagonal and '#'
    //                   above diagonal. Valid only when
    //                   iRow == iCol.
    //  Input :          Integer (iRow), Integer (iCol)
    //  Output :         Void
    //  Author :         Harshada patil
    //  Date :           22/11/2025
    //
    ////////////////////////////////////////////////////////////

    void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        if (iRow <= 0 || iCol <= 0)
        {
            System.out.println("INVALID INPUT");
            System.out.println("ROWS AND COLUMNS MUST BE POSITIVE");
            return;
        }

        if (iRow != iCol)
        {
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF ROWS AND COLUMNS SHOULD BE SAME");
            return;
        }

        for (i = 1; i <= iRow; i++)
        {
            for (j = 1; j <= iCol; j++)
            {
                if (i >= j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
////////////////////////////////////////////////////////////

class one
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of Rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns:");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}
// End of main


////////////////////////////////////////////////////////////
//
//  Test cases
//
////////////////////////////////////////////////////////////
//
//  Input : 4 4
//  Output :
//          *   #   #   #
//          *   *   #   #
//          *   *   *   #
//          *   *   *   *
//
//  ---------------------------------------------
//
//  Input : 3 3
//  Output :
//          *   #   #
//          *   *   #
//          *   *   *
//
//  ---------------------------------------------
//
//  Input : 4 5
//  Output :
//          INVALID INPUT
//          NUMBER OF ROWS AND COLUMNS SHOULD BE SAME
//
//  ---------------------------------------------
//
//  Input : 0 4 or -3 3
//  Output :
//          INVALID INPUT
//          ROWS AND COLUMNS MUST BE POSITIVE
//
//  ---------------------------------------------
////////////////////////////////////////////////////////////