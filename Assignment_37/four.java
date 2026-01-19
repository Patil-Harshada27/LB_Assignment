////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   This program returns the index of the 
//                  last occurrence of a given character in a string
//  Author :        Harshada patil
//  Date :          05/12/2025
//
////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : lastOccurrence
    //  Description   : Returns the index of last occurrence 
    //                  of a character in a given string 
    //                  (-1 if not found)
    //  Input         : String str, char ch
    //  Output        : int
    //  Author        : Harshada patil
    //  Date          : 05/12/2025
    //  Time Complexity : O(N)
    //
    ////////////////////////////////////////////////////////////

    public int lastOccurrence(String str, char ch)
    {
        int iPos = -1;

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ch)
            {
                iPos = iCnt;   
            }
        }

        return iPos;
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////

class four
{
    public static void main(String[] args)
    {
        Scanner ssobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the Character to find : ");
        char ch = sobj.next().charAt(0);

        StringX obj = new StringX();
        int iRet = obj.lastOccurrence(str, ch);

        if(iRet != -1)
        {
            System.out.println("Character '" + ch + "' last occurs at index " + iRet);
        }
        else
        {
            System.out.println("Character '" + ch + "' does not occur in the string.");
        }
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : HelloWorld          Character: o
//  Output : Character 'o' last occurs at index 7
//
//  Input : JAVAprogram         Character: a
//  Output : Character 'a' last occurs at index 7
//
//  Input : Harshada patil      Character: d
//  Output : Character 'd' last occurs at index 1
//
//  Input : Harshada     Character: z
//  Output : Character 'z' does not occur in the string
//
//  Input : 123 ABC 123         Character: 1
//  Output : Character '1' last occurs at index 10
//
////////////////////////////////////////////////////////////