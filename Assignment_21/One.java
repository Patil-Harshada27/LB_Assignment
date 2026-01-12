
////////////////////////////////////////////////////////////
// 
//  File name :     one.java
//  Description :   To calculate product of digits of a Number
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int CalculateProductofDigits(int iNo)
    {
        int iDigit = 0;
        int iMult = 1;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        if (iNo == 0)
        {
            return 0;
        }

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }

        return iMult;
    }
}

class one
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 2345;
        int iRet = 0;

        iRet = lobj.CalculateProductofDigits(iValue);

        System.out.println("Product of digits  is: " + iRet);
    }
}