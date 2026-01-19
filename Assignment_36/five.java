////////////////////////////////////////////////////////////
//
//  File name :     five.java
//  Description :   This program toggles the case of all 
//                  letters in a given string.
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
    //  Function Name : toggleCase
    //  Description   : Toggles the case of letters in string
    //  Input         : String src
    //  Output        : String (toggled string)
    //  Time Complexity : O(N)
    //
    ////////////////////////////////////////////////////////////
    public String toggleCase(String src)
    {
        String dest = "";

        for(int i = 0; i < src.length(); i++)
        {
            char ch = src.charAt(i);

            if(ch >= 'A' && ch <= 'Z')   
            {
                ch = (char)(ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z') 
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
class five
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String strobj = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.toggleCase(strobj);

        System.out.println("Toggled Case String: " + sRet);
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : HelloWorld
//  Output: hELLOwORLD
//
//  Input : Java Programming
//  Output: jAVA pROGRAMMING
//
//  Input : 123 abc XYZ!
//  Output: 123 ABC xyz!
//
////////////////////////////////////////////////////////////