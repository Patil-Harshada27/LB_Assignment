////////////////////////////////////////////////////////////
// 
//  File name :     Five.java
//  Description :   To count number of digits in a given number
//  Author :        harshada patil
//  Date :          01/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int CountDigits(int iNo)
    {
        int iCnt = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        if (iNo == 0)
        {
            return 1;
        }

        while (iNo != 0)
        {
            iNo = iNo / 10;  
            iCnt++;          
        }

        return iCnt;
    }
}

class five
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 7865;
        int iRet = lobj.CountDigits(iValue);

        System.out.println("The number of digits in " + iValue + " is: " + iRet);
    }
}