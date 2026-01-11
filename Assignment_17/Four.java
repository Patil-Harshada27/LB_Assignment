////////////////////////////////////////////////////////////
// 
//  File name :     Four.java
//  Description :   To find maximum of three Numbers
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    int FindMaximum(int iNo1, int iNo2, int iNo3)
    {
        int iMax;

        if (iNo1 > iNo2 && iNo1 > iNo3)
        {
            iMax = iNo1;
        }
        else if (iNo2 > iNo3)
        {
            iMax = iNo2;
        }
        else
        {
            iMax = iNo3;
        }

        return iMax;
    }
}

class four
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int iNo1 = sobj.nextInt();

        System.out.print("Enter second number: ");
        int iNo2 = sobj.nextInt();

        System.out.print("Enter third number: ");
        int iNo3 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.FindMaximum(iNo1, iNo2, iNo3);

        System.out.println("The maximum of the three numbers is: " + iRet);
    }
}