////////////////////////////////////////////////////////////
//
//  File name :     three.java
//  Description :   This program returns the index of the 
//                  first occurrence of a given character in a string
//  Author :        Harshada patil
//  Date :          05/12/2025
//
////////////////////////////////////////////////////////////

import java.util.*;


class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : firstOccurrence
    //  Description   : Returns the index of first occurrence 
    //                  of a character in a given string 
    //                  (-1 if not found)
    //  Input         : String str, char ch
    //  Output        : int
    //  Author        :Harshada patil 
    //  Date          : 05/12/2025
    //  Time Complexity: O(N)
    //
    ////////////////////////////////////////////////////////////

    public int firstOccurrence(String Arr, char ch)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length(); iCnt++)
        {
            if(Arr.charAt(iCnt) == ch)
            {
                return iCnt;   
            }
        }
        return -1;  
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////

class three
{
    public static void main(String[] args)
    {
        Scanner = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the Character to find:");
        char ch = sobj.next().charAt(0);

        StringX obj = new StringX();
        int iRet = obj.firstOccurrence(str, ch);

        if(iRet != -1)
        {
            System.out.println("Character '" + ch + "' first occurs at index " + iRet);
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
//  Input : HelloWorld          Character : o
//  Output : Character 'o' first occurs at index 4
//
//  Input : JAVAprogram        Character : a
//  Output : Character 'a' first occurs at index 1
//
//  Input : 123 ABC xyz!       Character : 1
//  Output : Character '1' first occurs at index 0
//
////////////////////////////////////////////////////////////