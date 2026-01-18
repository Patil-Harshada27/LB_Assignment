////////////////////////////////////////////////////////////
//
//  File name :     two.java
//  Description :   Program to check whether the entered 
//                  character is a capital alphabet or not
//  Author :        Harshada patil
//  Date :          04/12/2025
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
    //  Function Name : CheckCapital
    //  Description :   Checks whether the entered character 
    //                  is a capital alphabet (A–Z)
    //  Input :         String str
    //  Output :        Boolean
    //
    ////////////////////////////////////////////////////////////
    public Boolean CheckCapital(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);  

        if (ch >= 'A' && ch <= 'Z')   
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

class two
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
            System.out.println("It is Capital.");
        }
        else
        {
            System.out.println("It is NOT Capital.");
        }

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : A      Output : It is Capital.
//  Input : Z      Output : It is Capital.
//  Input : a      Output : It is NOT Capital.
//  Input : 9      Output : It is NOT Capital.
//  Input : @      Output : It is NOT Capital.
//
////////////////////////////////////////////////////////////