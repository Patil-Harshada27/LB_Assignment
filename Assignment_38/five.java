////////////////////////////////////////////////////////////
//
//  File name :     five.java
//  Description :   This program counts the number of spaces
//                  in a string
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
    //  Function Name : CountSpaces
    //  Description   : Counts the number of spaces in the string
    //  Input         : String str
    //  Output        : void
    //
    ////////////////////////////////////////////////////////////
    public void CountSpaces(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of Spaces is : " + iCount);
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

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.CountSpaces(sobj);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello World                  Output : 1
//  Input : Marvellous Infosystems       Output : 1
//  Input : NoSpacesHere                 Output : 0
//  Input : Multiple Spaces              Output : 4
//
////////////////////////////////////////////////////////////