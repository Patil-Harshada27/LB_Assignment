////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   This program displays numbers in
//                  decreasing order row-wise.
//                  Each row contains the same number 
//                  repeated across all columns.
//
//  Author :        Harshada anil patil
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name :  Display
    //  Description :    Prints numbers starting from iRow down
    //                   to 1. Each number is printed iCol times
    //                   in a row.
    //  Input :          Integer (iRow), Integer (iCol)
    //  Output :         Void
    //  Author :         Harshada anil patil
    //  Date :           21/11/2025
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

        for (i = iRow; i >= 1; i--)
        {
            for (j = 1; j <= iCol; j++)
            {
                System.out.print(i + "\t");
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
//           1
//
//  ---------------------------------------------
//
//  Input : iRow = 1, iCol = 5
//  Output : 
//           1   1   1   1   1
//
//  ---------------------------------------------
//
//  Input : iRow = 3, iCol = 4
//  Output : 
//           3   3   3   3
//           2   2   2   2
//           1   1   1   1
//
//  ---------------------------------------------
//
//  Input : iRow = 4, iCol = 2
//  Output : 
//           4   4
//           3   3
//           2   2
//           1   1
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