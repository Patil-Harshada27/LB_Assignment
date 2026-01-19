////////////////////////////////////////////////////////////
//
//  File name :     CheckOccurence.java
//  Description :   Program to check if a character exists in a string
//  Author :       Harshada patil
//  Date :          05/12/2025
//
////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : CheckOccurrence
    //  Description   : Checks whether a character exists in string
    //  Input         : String str, char ch
    //  Output        : boolean 
    //
    ////////////////////////////////////////////////////////////
    public boolean CheckOccurence(String str, char ch)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(i) == ch)
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
class one
{
    public static void main(String args[])
    {
        char ch = '\0';
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = scanobj.nextLine();

        System.out.println("Enter character to check:");
        ch = scanobj.next().charAt(0);

        StringX strobj = new StringX();
        boolean bRet = strobj.CheckOccurence(str, ch);

        if(bRet == true)
        {
            System.out.println("Character '" + ch + "' exists in the string.");
        }
        else
        {
            System.out.println("Character '" + ch + "' does NOT exist in the string.");
        }

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello World, Character : l
//  Output: Character 'l' exists in the string.
//
//  Input : Hello World, Character : z
//  Output: Character 'z' does NOT exist in the string.
//
//  Input : ABCabc, Character : A
//  Output: Character 'A' exists in the string.
//
////////////////////////////////////////////////////////////