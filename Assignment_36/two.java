////////////////////////////////////////////////////////////
//
//  File name :     two.java
//  Description :   This program converts all small letters
//                  in a string to capital letters
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
    //  Function Name : struprX
    //  Description   : Converts all small letters in string
    //                  to capital letters
    //  Input         : String str
    //  Output        : String
    //  Author        : Harshada patil
    //  Date          : 05/12/2025
    //  Time Complexity: O(N)
    //
    ////////////////////////////////////////////////////////////
    public String struprX(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
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
class two
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        String sRet = strobj.struprX(sobj);

        System.out.println("Updated String is : " + sRet);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : hello world        Output : HELLO WORLD
//  Input : Java Programming   Output : JAVA PROGRAMMING
//  Input :  Harshada patil     Output :  Harshada patil
//  Input : 123 abc XYZ!       Output : 123 ABC XYZ!
//
////////////////////////////////////////////////////////////