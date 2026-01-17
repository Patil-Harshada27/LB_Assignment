////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   This program displays a pattern of '*' 
//                  and '#' in alternate columns for the
//                  given number of rows and columns.
//  Author :        Harshada Anil patil 
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;


class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name :  Display
    //  Description :    Displays a pattern of '*' and '#' 
    //                   in alternate columns based on input.
    //  Input :          Integer (iRow), Integer (iCol)
    //  Output :         Void
    //  Author :         Harshada anil patil
    //  Date :           23/11/2025
    //
    ////////////////////////////////////////////////////////////
    void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        if (iRow <= 0 || iCol <= 0)
        {
            return;
        }

        for (i = 1; i <= iRow; i++)
        {
            for (j = 1; j <= iCol; j++)
            {
                if (j % 2 != 0)
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


class four
{
    
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}
// End of main

////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by the application
//
//  Input : iRow = 1, iCol = 1
//  Output : 
//           *
//
//  ---------------------------------------------
//
//  Input : iRow = 1, iCol = 5
//  Output : 
//           *   #   *   #   *
//
//  ---------------------------------------------
//
//  Input : iRow = 3, iCol = 4
//  Output : 
//           *   #   *   #
//           *   #   *   #
//           *   #   *   #
//
//  ---------------------------------------------
//
//  Input : iRow = 4, iCol = 2
//  Output : 
//           *   #
//           *   #
//           *   #
//           *   #
//
//  ---------------------------------------------
//
//  Input : iRow = 0, iCol = 5
//  Output : 
//           (No output)
//
//  ---------------------------------------------
//
//  Input : iRow = -3, iCol = 4
//  Output : 
//           (No output)
//
////////////////////////////////////////////////////////////