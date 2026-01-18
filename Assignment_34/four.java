////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   Program to check whether the entered 
//                  character is a small alphabet or not
//  Author :        Harshada patil
//  Date :          04/12/2025
//
////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////
//
//  REQUIRED HEADER FILES
//
////////////////////////////////////////////////////////////

import java.util.*;


class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : CheckCapital
    //  Description :   Checks whether the entered character 
    //                  is a small alphabet (a–z)
    //  Input :         String str
    //  Output :        Boolean
    //
    ////////////////////////////////////////////////////////////
    public Boolean CheckCapital(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);

        if (ch >= 'a' && ch <= 'z')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////

class four
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Character:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        bRet = strobj.CheckCapital(sobj);

        if (bRet == true)
        {
            System.out.println("It is Small.");
        }
        else
        {
            System.out.println("It is NOT Small.");
        }

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : a      Output : It is Small.
//  Input : z      Output : It is Small.
//  Input : A      Output : It is NOT Small.
//  Input : 9      Output : It is NOT Small.
//  Input : @      Output : It is NOT Small.
//
////////////////////////////////////////////////////////////