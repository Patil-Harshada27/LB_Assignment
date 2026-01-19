////////////////////////////////////////////////////////////
//
//  File name :     RemoveSpaces.java
//  Description :   This program copies the input string 
//                  into another string after removing 
//                  all white spaces.
//  Author :         Harshada patil
//  Date :          06/12/2025
//
////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : removeSpaces
    //  Description   : Copies characters from src to dest
    //                  while skipping all white spaces.
    //  Input         : String src
    //  Output        : String
    //  Time Complexity : O(N)
    //
    ////////////////////////////////////////////////////////////

    public String removeSpaces(String src)
    {
        int iCnt = 0;
        String dest = "";   

        for(iCnt = 0; iCnt < src.length(); iCnt++)
        {
            char ch = '\0';
            ch = src.charAt(i);

            if(ch != ' ')    
            {
                dest = dest + ch;
            }
        }
        return dest;
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION FOR THE APPLICATION
//
////////////////////////////////////////////////////////////

class two
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String src = sobj.nextLine();

        StringX obj = new StringX();
        String dest = obj.removeSpaces(src);

        System.out.println("Updated String: " + dest);
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : "Hello World"
//  Output: "HelloWorld"
//
//  Input : "Marvellous Infosystems Pune"
//  Output: "MarvellousInfosystemsPune"
//
//  Input : "ABC"
//  Output: "ABC"
//
////////////////////////////////////////////////////////////