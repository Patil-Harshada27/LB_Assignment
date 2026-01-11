////////////////////////////////////////////////////////////
// 
//  File name :     Three.java
//  Description :   To find maximum of two Numbers
//  Author :        harshada anil patil
//  Date :          01/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    int FindMaximum(int iNo1, int iNo2)
    {
        if (iNo1 > iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }
}

class three
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int iNo1 = sobj.nextInt();

        System.out.print("Enter second number: ");
        int iNo2 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.FindMaximum(iNo1, iNo2);

        System.out.println("The maximum of the two numbers is: " + iRet);
    }
}