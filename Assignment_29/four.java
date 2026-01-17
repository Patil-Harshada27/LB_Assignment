////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   This program displays positive numbers
//                  on odd rows and negative numbers on even
//                  rows. The number of elements printed in 
//                  each row depends on the number of columns 
//                  entered by the user.
//
//  Author :      Harshada Anil patil
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name :  Display
    //  Description :    Prints +ve numbers on odd rows and
    //                   -ve numbers on even rows.
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

        int i = 0;
        int j = 0;

        for (i = 1; i <= iRow; i++)
        {
            if (i % 2 != 0)          
            {
                for (j = 1; j <= iCol; j++)
                {
                    System.out.print(j + "\t");
                }
            }
            else                     
            {
                for (j = 1; j <= iCol; j++)
                {
                    System.out.print((-j) + "\t");
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
//  Input : 1 4
//  Output :
//          1   2   3   4
//
//  ---------------------------------------------
//
//  Input : 2 4
//  Output :
//          1   2   3   4
//         -1  -2  -3  -4
//
//  ---------------------------------------------
//
//  Input : 4 5
//  Output :
//          1   2   3   4   5
//         -1  -2  -3  -4  -5
//          1   2   3   4   5
//         -1  -2  -3  -4  -5
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