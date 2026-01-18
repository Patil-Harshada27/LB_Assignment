////////////////////////////////////////////////////////////
//
//  File name :     two.java
//  Description :   This program counts the number of 
//                  small letters in a string
//  Author :       Harshada patil
//  Date :          28/11/2025
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
    //  Function Name : CountSmall
    //  Description   : Counts the number of small letters
    //                  in the given string
    //  Input         : String str
    //  Output        : int
    //
    ////////////////////////////////////////////////////////////
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
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
        iRet = strobj.CountSmall(sobj);

        System.out.println("Frequency of small characters is : " + iRet);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Modern College       Output : 11
//  Input : JAVA Programming      Output : 10
//  Input : Pallavi Sable         Output : 10
//
////////////////////////////////////////////////////////////