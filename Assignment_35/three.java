////////////////////////////////////////////////////////////
//
//  File name :     three.java
//  Description :   Program to count difference between 
//                  small and capital letters in a string
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
    //  Function Name : CountDifference
    //  Description   : Counts difference between small and 
    //                  capital letters in the given string
    //  Input         : String str
    //  Output        : int
    //
    ////////////////////////////////////////////////////////////
    public int CountDifference(String str)
    {
        int iCnt = 0;
        int iSmall = 0;
        int iCapital = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                iSmall++;
            }
            else if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                iCapital++;
            }
        }

        return (iSmall - iCapital);
    }
}

////////////////////////////////////////////////////////////
//
//  ENTRY POINT FUNCTION
//
////////////////////////////////////////////////////////////
class program_diff
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountDifference(sobj);

        System.out.println("Difference : " + iRet);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : HelloWorld          Output : 3
//  Input : JAVAprogram          Output : 3
//  Input : PallaviSABLE         Output : 1
//
////////////////////////////////////////////////////////////