////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   Program to check whether the entered 
//                  character is an alphabet or not
//  Author :       Harshada patil
//  Date :          04/12/2025
//
////////////////////////////////////////////////////////////

import java.util.*;


class StringX
{
    public Boolean CheckAlphabet(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);   

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
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

class one
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Character:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        bRet = strobj.CheckAlphabet(sobj);

        if(bRet == true)
        {
            System.out.println("It is an Alphabet.");
        }
        else
        {
            System.out.println("It is NOT an Alphabet.");
        }

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by the application
//  Input : A     Output : Alphabet
//  Input : z     Output : Alphabet
//  Input : 5     Output : NOT Alphabet
//  Input : @     Output : NOT Alphabet
//
////////////////////////////////////////////////////////////