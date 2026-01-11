////////////////////////////////////////////////////////////
//
//  File name :     Two.java
//  Description :   To print all even numbers up to N
//  Author :        harshada anil patil
//  Date :          01/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void DisplayEvenNumbers(int iNo)
    {
        int iCnt = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                 System.out.print(iCnt + "\t");
            }
           
        }
    }
}

class two
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter a number:");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayEvenNumbers(iValue);
    }
}