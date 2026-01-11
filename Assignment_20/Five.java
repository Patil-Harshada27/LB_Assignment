////////////////////////////////////////////////////////////
// 
//  File name :     Five.java
//  Description :   To find the smallest digit in the given 
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
        int iMin = 0;

        if (iNo < 0)
        {
            iNo = -iNo;     
        }

        while (iNo != 0)
        {
            iDigit = iNo % 10;     

            if (iDigit < iMin)
            {
                iMin = iDigit;     
            }

            iNo = iNo / 10;
        }

        return iMin;
    }
}

class five
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 78325;
        int iRet = 0;

        iRet = lobj.FindLargestDigit(iValue);

        System.out.println("The smallest digit is: " + iRet);
    }
}