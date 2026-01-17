////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   This program displays consecutive numbers 
//                  row-wise. Numbers increment from 1 to 9,
//                  and after 9, the sequence restarts from 1.
//                  Each row contains iCol numbers.
//                  
//  Author :       Harshada patil
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name :  Display
    //  Description :    Prints numbers from 1 to 9 repeatedly
    //                   in row-wise matrix format.
    //  Input :          Integer (iRow), Integer (iCol)
    //  Output :         Void
    //  Author :        Harshada patil
    //  Date :           23/11/2025
    //
    ////////////////////////////////////////////////////////////
    void Display(int iRow, int iCol)
    {
        if (iRow <= 0 || iCol <= 0)
        {
            return;
        }

        int i = 0;
        int j = 0;
        int iNo = 1;

        for (i = 1; i <= iRow; i++)
        {
            for (j = 1; j <= iCol; j++)
            {
                System.out.print(iNo + "\t");
                iNo++;

                if (iNo > 9)
                {
                    iNo = 1;
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
//           1   2   3   4   5
//
//  ---------------------------------------------
//
//  Input : iRow = 3, iCol = 5
//  Output :
//           1   2   3   4   5
//           6   7   8   9   1
//           2   3   4   5   6
//
//  ---------------------------------------------
//
//  Input : iRow = 4, iCol = 2
//  Output :
//           1   2
//           3   4
//           5   6
//           7   8
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