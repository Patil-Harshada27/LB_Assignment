////////////////////////////////////////////////////////////
//
//  File name :     StrCpyRevX.java
//  Description :   This program copies the given string 
//                  into another string in reverse order
//  Author :        Harshada patil
//  Date :          05/12/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////
//
//  Class Name    : StringX
//  Description   : Contains method to reverse-copy a string
//
////////////////////////////////////////////////////////////
class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : StrCpyRevX
    //  Description   : Copies the input string into another 
    //                  string in reverse order
    //  Input         : String src
    //  Output        : String
    //  Time Complexity : O(N)
    //
    ////////////////////////////////////////////////////////////
    public String StrCpyRevX(String src)
    {
        int iLength = 0;
        int iCnt = 0;

        String dest = "";
        iLength = src.length();

      
        for(iCnt = iLength - 1; iCnt >= 0; iCnt--)
        {
            dest = dest + src.charAt(iCnt);
        }

        return dest;
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT OF THE APPLICATION
//
////////////////////////////////////////////////////////////
class one
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String Arr = sobj.nextLine();

        StringX obj = new StringX();
        String Brr = obj.StrCpyRevX(Arr);

        System.out.println("Reversed Copied String: " + Brr);
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello World      
//  Output : dlroW olleH
//
//  Input : Marvellous Infosystems
//  Output : smetsysofnI suollevraM
//
////////////////////////////////////////////////////////////