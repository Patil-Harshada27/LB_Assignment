////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   Program to display only the digits
//                  present in the entered string
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

////////////////////////////////////////////////////////////
//
//  Class Name :    StringX
//  Description :   Contains logic to extract digits from string
//
////////////////////////////////////////////////////////////
class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayDigits
    //  Description   : Displays only digits from the string
    //  Input         : String str
    //  Output        : void
    //
    ////////////////////////////////////////////////////////////
    public void DisplayDigits(String str)
    {
        char Arr[] = str.toCharArray();

        System.out.print("Digits in the string are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                System.out.print(Arr[i]);
            }
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
class four
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.DisplayDigits(sobj);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : a1b2c3       Output : 123
//  Input : Hello2025    Output : 2025
//  Input : 9a8b7c       Output : 987
//  Input : NoDigitsHere Output : (No output)
//
////////////////////////////////////////////////////////////