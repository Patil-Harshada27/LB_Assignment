////////////////////////////////////////////////////////////
//
//  File name :     Four.java
//  Description :   To count total number of factors of a
//                  given number
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int CountFactors(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class four
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 12;
        int iRet = 0;

        iRet = lobj.CountFactors(iValue);

        System.out.println("Total number of factors is: " + iRet);
    }
}