////////////////////////////////////////////////////////////
//
//  File name :     three.java
//  Description :   This program copies the input string
//                  into another string by converting
//                  small letters to capital letters.
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
    //                  small letters to capital letters
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

            if(ch >= 'a' && ch <= 'z')   
            {
                ch = (char)(ch - 32);
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
public class three
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String strobj = sobj.nextLine();

        StringX obj = new StringX();

        String result = obj.StrCpyCap(strobj);

        System.out.println("Updated String : " + result);
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello World
//  Output: HELLO WORLD
//
//  Input : Harshada 
//  Output: HARSHADA
//
//  Input : aBcDeF123
//  Output: ABCDEF123
//
//  Input : marvellous infosystems
//  Output: MARVELLOUS INFOSYSTEMS
//
////////////////////////////////////////////////////////////