////////////////////////////////////////////////////////////
//
//  File name :     two.java
//  Description :   This program counts the number of occurrences
//                  of a given character in a string
//  Author :        Harshada patil
//  Date :          05/12/2025
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
    //  Function Name : CountOccurence
    //  Description   : Counts the occurrences of a character
    //                  in a given string
    //  Input         : String str, char ch
    //  Output        : int
    //  Author        : Harshada patil
    //  Date          : 05/12/2025
    //
    ////////////////////////////////////////////////////////////
    public int CountOccurence(String str, char ch)
    {
        int iCount = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
class two
{
    public static void main(String[] args)
    {
        Scanner scanobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter String:");
        String str = scanobj.nextLine();

        System.out.println("Enter the Character you want to count:");
        char cValue = scanobj.next().charAt(0);

        int iRet = strobj.CountOccurence(str, cValue);

        if(iRet > 0)
        {
            System.out.println("Character '" + cValue + "' occurs " + iRet + " times in the string.");
        }
        else
        {
            System.out.println("Character '" + cValue + "' does not occur in the string.");
        }

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : HelloWorld          Character: o
//  Output : Character 'o' occurs 2 times in the string.
//
//  Input : JAVAprogram          Character: a
//  Output : Character 'a' occurs 2 times in the string.
//
//  Input : 123 ABC xyz!         Character: 1
//  Output : Character '1' occurs 1 times in the string.
//
////////////////////////////////////////////////////////////