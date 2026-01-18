////////////////////////////////////////////////////////////
//
//  File name :     four.java
//  Description :   This program counts the number of vowels
//                  in a string
//  Author :        Harshada patil
//  Date :          27/11/2025
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
//  Description :   Contains logic to count vowels
//
////////////////////////////////////////////////////////////
class StringX
{
    ////////////////////////////////////////////////////////////
    //
    //  Function Name : CountVowels
    //  Description   : Counts number of vowels in the given string
    //  Input         : String str
    //  Output        : int
    //
    ////////////////////////////////////////////////////////////
    public int CountVowels(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u' ||
               Arr[i] == 'A' || Arr[i] == 'E' || Arr[i] == 'I' || Arr[i] == 'O' || Arr[i] == 'U')
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
class four
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);
        StringX strobj = new StringX();
        int iRet = 0;

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        iRet = strobj.CountVowels(sobj);

        System.out.println("Number of Vowels in String is : " + iRet);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : Hello World      Output : 3
//  Input : JAVA Program     Output : 4
//  Input : Pallavi          Output : 3
//
////////////////////////////////////////////////////////////