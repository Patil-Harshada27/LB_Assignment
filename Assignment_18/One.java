////////////////////////////////////////////////////////////
//
//  File name :     One.java
//  Description :   To check whether the number is prime or 
//                  not
//  Author :        harshada anil patil
//  Date :          01/11/2025
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        if (iNo <= 1)
        {
            return false;
        }

        for (iCnt = 2; iCnt <= iNo / 2; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                return false;
            }
        }

        return true;
    }
}

class one
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter a number:");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        bRet = lobj.CheckPrime(iValue);

        if (bRet == true)
        {
            System.out.println(iValue + " is a Prime Number");
        }
        else
        {
            System.out.println(iValue + " is not a Prime Number");
        }
    }
}