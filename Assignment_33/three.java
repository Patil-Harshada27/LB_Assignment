////////////////////////////////////////////////////////////
//
//  File name :     three.java
//  Description :   Program to toggle case and display sequence
//                  based on entered character
//  Author :        Harshada patil
//  Date :          05/12/2025
//
////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////
//
//  REQUIRED PACKAGES
//
////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : Toggle
    //  Description :   If character is capital, display from 
    //                  that character up to Z in capital.  
    //                  If character is small, display from 
    //                  that character down to a in small.
    //  Input :         String str
    //  Output :        void
    //
    ////////////////////////////////////////////////////////////
    public void Toggle(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);
        char iCnt = '\0';

        if (ch >= 'A' && ch <= 'Z')     
        {
            for (iCnt = ch; iCnt <= 'Z'; iCnt++)
            {
                System.out.print(iCnt + " ");
            }
            System.out.println();
        }
        else if (ch >= 'a' && ch <= 'z')   // Small letter
        {
            for (iCnt = ch; iCnt >= 'a'; iCnt--)
            {
                System.out.print(iCnt + " ");
            }
            System.out.println();
        }
        else
        {
            System.out.println("Invalid Character.");
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////

class three
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Character:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.Toggle(sobj);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : A     Output : A B C D ... Z
//  Input : D     Output : D E F ... Z
//  Input : Z     Output : Z
//  
//  Input : a     Output : a
//  Input : d     Output : d c b a
//  Input : m     Output : m l k ... a
//
//  Input : 9     Output : Invalid Character.
//  Input : @     Output : Invalid Character.
//
////////////////////////////////////////////////////////////