
////////////////////////////////////////////////////////////
// 
//  File name :     one.java
//  Description :   To calculate Sum of all even Numbers 
//                  upto N
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class SumDigits
{
    int CalculateSumEven(int iNo)
    {
        int iSum = 0;

        for (int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

class one
{
    public static void main(String A[])
    {
        int iRet = 0;
        SumDigits sobj = new SumDigits();

        iRet = sobj.CalculateSumEven(10);

        System.out.println("Sum of all even numbers up to 10 is: " + iRet);
    }
}