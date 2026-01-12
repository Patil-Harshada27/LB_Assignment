////////////////////////////////////////////////////////////
//
//  File name :     Two.java
//  Description :   To find out how many odd and even 
//                  numbers are present between 1 and N
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    void CountEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int iEvenCount = 0;
        int iOddCount = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iCnt % 2 == 0)
            {
                iEvenCount++;
            }
            else if (iCnt % 2 != 0)
            {
                iOddCount++;
            }
        }

        System.out.println("Count of Even Numbers: " + iEvenCount);
        System.out.println("Count of Odd Numbers: " + iOddCount);
    }
}

class two
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 50;

        lobj.CountEvenOddRange(iValue);
    }
}