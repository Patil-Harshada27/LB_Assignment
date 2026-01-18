////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   Program to check whether the entered 
//                  character is a special symbol or not
//  Author :        Harshada Patil
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
    //  Function Name : CheckSpecial
    //  Description :   Checks whether the entered character 
    //                  is a special symbol
    //  Input :         String str
    //  Output :        void
    //
    ////////////////////////////////////////////////////////////
    public void CheckSpecial(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || 
            (ch >= 'a' && ch <= 'z') ||
            (ch >= '0' && ch <= '9'))
        {
            System.out.println("NOT a Special Symbol.");
        }
        else
        {
            System.out.println("It IS a Special Symbol.");
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////

class special
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Character:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.CheckSpecial(sobj);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : A     Output : NOT a Special Symbol.
//  Input : z     Output : NOT a Special Symbol.
//  Input : 5     Output : NOT a Special Symbol.
//  Input : @     Output : It IS a Special Symbol.
//  Input : #     Output : It IS a Special Symbol.
//  Input : _     Output : It IS a Special Symbol.
//
////////////////////////////////////////////////////////////