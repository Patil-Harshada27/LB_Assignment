////////////////////////////////////////////////////////////
//
//  File name :     five.java
//  Description :   This program displays first 'iNo' even 
//                  numbers (2, 4, 6, ...)
//  Author :        Harshada anil patil
//  Date :          23/11/2025
//
////////////////////////////////////////////////////////////

/*
    INPUT  : 5
    OUTPUT : 2   4   6   8   10
*/

import java.util.Scanner;

////////////////////////////////////////////////////////////
//
//  Class Name :     Pattern
//  Description :     Contains logic to display the first 
//                    iNo even numbers
//
////////////////////////////////////////////////////////////
class Pattern
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description :   Displays the first iNo even numbers
    //  Input :         int iNo
    //  Output :        Void
    //
    ////////////////////////////////////////////////////////////
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (2 * iNo); iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.printf("%d\t", iCnt);
            }
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
public class five
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
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
//          2
//
// ---------------------------------------------
//
//  Input : 3
//  Output :
//          2   4   6
//
// ---------------------------------------------
//
//  Input : 5
//  Output :
//          2   4   6   8   10
//
// ---------------------------------------------
//
//  Input : 7
//  Output :
//          2   4   6   8   10   12   14
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