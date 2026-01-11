////////////////////////////////////////////////////////////
// 
//  File name :     One.java
//  Description :   To calculate Sum of Digits of a given number
//  Author :        harshada patil
//  Date :          01/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int CalculateSum(int iNo)
    {
        int iSum = 0, iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;         
        }

        return iSum;
    }
}

class one
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 12345;
        int iRet = lobj.CalculateSum(iValue);

        System.out.println("Sum of digits of " + iValue + " is: " + iRet);
    }
}