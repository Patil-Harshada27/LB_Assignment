////////////////////////////////////////////////////////////
//
//  File name :     TwentyNineTwo.java
//  Description :   This program displays even numbers on 
//                  odd rows and odd numbers on even rows.
//                  Numbers are printed up to the number of 
//                  columns entered by the user.
//
//  Author :       Harshada anil patil
//  Date :          21/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////
//
//  Class Name :     PatternEvenOddRows
//  Description :    Prints even numbers on odd rows and
//                   odd numbers on even rows.
//  Author :        Harshada anil patil
//  Date :           21/11/2025
//
////////////////////////////////////////////////////////////

class PatternEvenOddRows
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name :  Display
    //  Description :    Prints even numbers on odd rows and
    //                   odd numbers on even rows.
    //  Input :          Integer (iRow), Integer (iCol)
    //  Output :         Void
    //  Author :        Harshada anil patil
    //  Date :           21/11/2025
    //
    ////////////////////////////////////////////////////////////
    void Display(int iRow, int iCol)
    {
        if (iRow <= 0 || iCol <= 0)
        {
            return;
        }

        for (int i = 1; i <= iRow; i++)
        {
            if (i % 2 != 0)           // Odd row → even numbers
            {
                for (int j = 1; j <= iCol; j++)
                {
                    System.out.print((2 * j) + "\t");
                }
            }
            else                      // Even row → odd numbers
            {
                for (int j = 1; j <= iCol; j++)
                {
                    System.out.print(((2 * j) - 1) + "\t");
                }
            }

            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////
//
//  Class Name :     TwentyNineTwo
//  Description :    Entry point of the application
//  Author :        harsahada anil patil
//  Date :           21/11/2025
//
////////////////////////////////////////////////////////////

class TwentyNineTwo
{
    ////////////////////////////////////////////////////////////
    //
    //  Entry Point Function for the Application
    //
    ////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of Rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns:");
        iValue2 = sobj.nextInt();

        PatternEvenOddRows pobj = new PatternEvenOddRows();
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
//  Input : 1 5
//  Output :
//          2   4   6   8   10
//
//  ---------------------------------------------
//
//  Input : 2 4
//  Output :
//          2   4   6   8
//          1   3   5   7
//
//  ---------------------------------------------
//
//  Input : 4 5
//  Output :
//          2   4   6   8   10
//          1   3   5   7   9
//          2   4   6   8   10
//          1   3   5   7   9
//
//  ---------------------------------------------
//
//  Input : 0 5 or -3 4
//  Output :
//          (No output)
//
//  ---------------------------------------------
//
////////////////////////////////////////////////////////////