////////////////////////////////////////////////////////////
//
//  File name :     five.java
//  Description :   Program to display exam timing based on
//                  the entered division (A, B, C, D)
//  Author :        Harshada patil
//  Date :          04/12/2025
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
    //  Function Name : DisplaySchedule
    //  Description :   Displays exam timing based on division
    //  Input :         String str
    //  Output :        void
    //
    ////////////////////////////////////////////////////////////
    public void DisplaySchedule(String str)
    {
        char ch ='\0';
        ch = str.charAt(0);

        if (ch == 'A' || ch == 'a')
        {
            System.out.println("Your exam is at 7:00 AM");
        }
        else if (ch == 'B' || ch == 'b')
        {
            System.out.println("Your exam is at 8:30 AM");
        }
        else if (ch == 'C' || ch == 'c')
        {
            System.out.println("Your exam is at 9:20 AM");
        }
        else if (ch == 'D' || ch == 'd')
        {
            System.out.println("Your exam is at 10:30 AM");
        }
        else
        {
            System.out.println("Invalid Division.");
        }
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

        System.out.println("Enter Division (A/B/C/D):");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.DisplaySchedule(sobj);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : A     Output : Your exam is at 7:00 AM
//  Input : b     Output : Your exam is at 8:30 AM
//  Input : C     Output : Your exam is at 9:20 AM
//  Input : d     Output : Your exam is at 10:30 AM
//  Input : X     Output : Invalid Division.
//
////////////////////////////////////////////////////////////