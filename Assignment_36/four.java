////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   This program copies the input string
//                  into another string by converting
//                  capital letters to small letters.
//  Author :        Harshada patil
//  Date :          05/12/2025
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
    //  Function Name : StrCpyCap
    //  Description   : Copies src to dest and converts 
    //                  capital letters to small letters
    //  Input         : String src
    //  Output        : String (converted string)
    //  Time Complexity : O(N)
    //
    ////////////////////////////////////////////////////////////
    public String StrCpyCap(String src)
    {
        int iCnt = 0;

        String dest = "";

        for(iCnt = 0; iCnt < src.length(); iCnt++)
        {
            char ch = src.charAt(iCnt);

            if(ch >= 'A' && ch <= 'Z')   
            {
                ch = (char)(ch + 32);   
            }

            dest = dest + ch;           
        }

        return dest;
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
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String strobj = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.StrCpyCap(strobj);

        System.out.println("Updated String : " + sRet);
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello World
//  Output: hello world
//
//  Input : Harshada
//  Output harshada
//
//  Input : aBcDeF123
//  Output: abcdef123
//
//  Input : MARVELLOUS infosystems
//  Output: marvellous infosystems
//
////////////////////////////////////////////////////////////