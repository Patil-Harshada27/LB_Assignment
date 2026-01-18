////////////////////////////////////////////////////////////
//
//  File name :     five.java
//  Description :   Program to display the ASCII value of 
//                  the entered character in Decimal,
//                  Octal, and Hexadecimal formats
//  Author :       Harshada patil
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
    //  Function Name : DisplayASCII
    //  Description :   Displays ASCII value in Decimal,
    //                  Octal and Hexadecimal formats
    //  Input :         String str
    //  Output :        void
    //
    ////////////////////////////////////////////////////////////
    public void DisplayASCII(String str)
    {
        char ch ='\0';

        ch = str.charAt(0);       
        int i = (int) ch;          

        System.out.println("Decimal Value     : " + i);
        System.out.println("Octal Value       : " + Integer.toOctalString(i));
        System.out.println("Hexadecimal Value : 0X" + Integer.toHexString(i));
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////

class five
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Character:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.DisplayASCII(sobj);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : A     Output : Decimal=65  Octal=101   Hex=0X41
//  Input : a     Output : Decimal=97  Octal=141   Hex=0X61
//  Input : 0     Output : Decimal=48  Octal=60    Hex=0X30
//  Input : @     Output : Decimal=64  Octal=100   Hex=0X40
//  Input : #     Output : Decimal=35  Octal=43    Hex=0X23
//
////////////////////////////////////////////////////////////