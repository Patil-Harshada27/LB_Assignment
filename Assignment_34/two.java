////////////////////////////////////////////////////////////
//
//  File name :     two.java
//  Description :   Program to toggle the case of the 
//                  entered character
//  Author :       Harshada Patil
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
    //  Description :   Toggles the case of the entered character
    //  Input :         String str
    //  Output :        void
    //
    ////////////////////////////////////////////////////////////
    public void Toggle(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);
        char cSmall = '\0';
        char cCapital = '\0';

        if (ch >= 'A' && ch <= 'Z')   
        {
            cSmall = (char)(ch + 32);
            System.out.println("Toggled Character: " + cSmall);
        }
        else if (ch >= 'a' && ch <= 'z')   
        {
            cCapital = (char)(ch - 32);
            System.out.println("Toggled Character: " + cCapital);
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

class two
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
//  Input : A     Output : a
//  Input : Z     Output : z
//  Input : a     Output : A
//  Input : m     Output : M
//  Input : 9     Output : Invalid Character.
//  Input : @     Output : Invalid Character.
//
////////////////////////////////////////////////////////////