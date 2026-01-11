
////////////////////////////////////////////////////////////
// 
//  File name :     Five.java
//  Description :   To calculate the power of a number using 
//                  for loop
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int CalculatePower(int iBase, int iExponent)
    {
        int iResult = 1;
        int iCnt = 0;
        
        if (iExponent < 0)
        {
            iExponent = -iExponent;
        }
        for (iCnt = 1; iCnt <= iExponent; iCnt++)
        {
            iResult = iResult * iBase;
        }

        return iResult;
    }
}

class five
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int base = 2;
        int exponent = 5;

        int iRet = lobj.CalculatePower(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + iRet);
    }
}