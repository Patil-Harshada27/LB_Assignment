////////////////////////////////////////////////////////////
//
//  File name :     three.java
//  Description :   This program displays a pattern of
//                  reverse numbers with iRow rows and
//                  iCol columns.
//  Author :        harshada anil patil
//  Date :          21/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;



class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name :  Display
    //  Description :    Displays reverse number pattern with
    //                   given number of rows and columns.
    //  Input :          Integer (iRow), Integer (iCol)
    //  Output :         Void
    //  Author :         harshada anil patil 
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

        for (i = 1; i <= iRow; i++)
        {
            for (j = iCol; j >= 1; j--)
            {
                System.out.print(j + "\t");
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


class three
{
    
    public static void main(String[] args)
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
//           5   4   3   2   1
//
//  ---------------------------------------------
//
//  Input : iRow = 3, iCol = 4
//  Output : 
//           4   3   2   1
//           4   3   2   1
//           4   3   2   1
//
//  ---------------------------------------------
//
//  Input : iRow = 4, iCol = 2
//  Output : 
//           2   1
//           2   1
//           2   1
//           2   1
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