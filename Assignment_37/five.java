////////////////////////////////////////////////////////////
//
//  File name :     five.java
//  Description :   This program reverses a stringin place
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
    //  Function Name : ReverseX
    //  Description   : Reverses the given string
    //  Input         : String str
    //  Output        : String
    //
    ////////////////////////////////////////////////////////////
    public String ReverseX(String str)
    {
        char Arr[] = str.toCharArray();
        int start = 0;
        int end = Arr.length - 1;
        char temp;

        while(start < end)
        {
            temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;
        }

        return new String(Arr);
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
class program242
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        String sRet = strobj.ReverseX(sobj);

        System.out.println("Updated String: " + sRet);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello World      Output : dlroW olleH
//  Input :Harshada        Output : adahsraH
//  Input : CProgramming     Output : gnimmargorPC
//
////////////////////////////////////////////////////////////