////////////////////////////////////////////////////////////
// 
//  File name :     Four.java
//  Description :   To find the largest digit in the given 
//                  number
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int FindLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        if (iNo < 0)
        {
            iNo = -iNo;     
        }

        while (iNo != 0)
        {
            iDigit = iNo % 10;     

            if (iDigit > iMax)
            {
                iMax = iDigit;     
            }

            iNo = iNo / 10;
        }

        return iMax;
    }
}

class four
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 78325;
        int iRet = 0;

        iRet = lobj.FindLargestDigit(iValue);

        System.out.println("The largest digit is: " + iRet);
    }
}