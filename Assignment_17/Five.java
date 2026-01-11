////////////////////////////////////////////////////////////
//
//  File name :     Five.java
//  Description :   Accept one number from user and 
//                  print table of that number
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void DisplayTable(int iNo)
    {
        int iCnt = 0;
        int iMult = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= 10; iCnt++)
        {
            iMult = iNo * iCnt;
            System.out.print(iMult + "\t");
        }
    }
}

class five
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter your number:");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayTable(iValue);
    }
}