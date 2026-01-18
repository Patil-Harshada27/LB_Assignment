////////////////////////////////////////////////////////////
//
//  File name :     Three.java
//  Description :   Program to check whether the entered 
//                  character is a digit or not
//  Author :        Harshada patil
//  Date :          04/12/2025
//
////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : CheckDigit
    //  Description :   Checks whether the entered character 
    //                  is a Digit
    //  Input :         String str
    //  Output :        Boolean
    //
    ////////////////////////////////////////////////////////////
    public Boolean CheckDigit(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);

        if ((ch >= '0' && ch <= '9'))
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
//  Entry Point Function
//
////////////////////////////////////////////////////////////

class three
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Character:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        bRet = strobj.CheckDigit(sobj);

        if(bRet == true)
        {
            System.out.println("It is a Digit.");
        }
        else
        {
            System.out.println("It is NOT a Digit.");
        }

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by the application
//  Input : A     Output : NOT Digit
//  Input : z     Output : NOT Digit
//  Input : 5     Output : Digit
//  Input : @     Output : NOT Digit
//
////////////////////////////////////////////////////////////