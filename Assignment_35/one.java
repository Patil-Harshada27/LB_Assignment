////////////////////////////////////////////////////////////
//
//  File name :     one.java
//  Description :   This program counts the number of 
//                  capital letters in a string
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
    //  Function Name : CountCapital
    //  Description   : Counts the number of capital letters 
    //                  in the given string
    //  Input         : String str
    //  Output        : int
    //
    ////////////////////////////////////////////////////////////
    public int CountCapital(String str)
    {
        int iCnt = 0;
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
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
class one
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountCapital(sobj);

        System.out.println("Frequency of Capital characters is : " + iRet);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hi               Output : 1
//  Input : JAVA             Output : 4
//  Input : pallavi          Output : 0
//
////////////////////////////////////////////////////////////