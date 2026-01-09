////////////////////////////////////////////////////////////
// 
//  File name :     Four.java
//  Description :   To reverse a number
//  Author :        harshada patil
//  Date :          01/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int ReverseNumber(int iNo)
    {
        int iRev = 0, iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;           
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;              
        }

        return iRev;
    }
}

class four
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
    
        int iRet = lobj.ReverseNumber(12345);

        System.out.print("Reverse is: " + iRet);
    }
}