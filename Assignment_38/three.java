////////////////////////////////////////////////////////////
//
//  File name :     three.java
//  Description :   This program toggles the case of all
//                  letters in a string
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
    //  Function Name : strtoggleX
    //  Description   : Toggles the case of letters in string
    //  Input         : String str
    //  Output        : String
    //
    ////////////////////////////////////////////////////////////
    public String strtoggleX(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
            else if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char)(Arr[i] + 32);
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
class three
{
    public static void main(String args[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        String result = strobj.strtoggleX(sobj);

        System.out.println("Updated String is : " + result);

        scanobj.close();
    }
}

////////////////////////////////////////////////////////////
//
//  Test Cases Successfully Handled by the Application
//
//  Input : HelloWorld      Output : hELLOwORLD
//  Input : Java Programming Output : jAVA pROGRAMMING
////////////////////////////////////////////////////////////