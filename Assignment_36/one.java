////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   Program to convert all capital letters
//                  in a string to small letters
//  Author :        Harshada patil
//  Date :          5/12/2025
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
    //  Function Name : strlwrX
    //  Description   : Converts capital letters to small letters
    //  Input         : String str
    //  Output        : String
    //
    ////////////////////////////////////////////////////////////
    public String strlwrX(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char)(Arr[i] + 32);
            }
        }

        return new String(Arr);
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
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        String sRet = strobj.strlwrX(sobj);

        System.out.println("Updated String is : " + sRet);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : HELLO WORLD        Output : hello world
//  Input : Java Programming   Output : java programming
//  Input : Pallavi Sable      Output : pallavi sable
//  Input : 123 ABC xyz!       Output : 123 abc xyz!
//
////////////////////////////////////////////////////////////