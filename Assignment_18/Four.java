////////////////////////////////////////////////////////////
// 
//  File name :     Four.java
//  Description :   To find the sum of even and odd digits 
//                  separately in a number
//  Author :        harshada anil patil
//  Date :          01/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    void CalculateSumEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;

            if (iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Sum of even digits: " + iEvenSum);
        System.out.println("Sum of odd digits: " + iOddSum);
    }
}

class four
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 12345;

        lobj.CalculateSumEvenOddDigits(iValue);
    }
}