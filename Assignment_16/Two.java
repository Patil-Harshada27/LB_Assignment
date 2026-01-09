////////////////////////////////////////////////////////////
// 
//  File name :     Two.java
//  Description :   To check whether the number is Even 
//                  or Odd
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    boolean CheckEvenOdd(int iNo)
    {
        if (iNo % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class two
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Logic lobj = new Logic();
        bRet = lobj.CheckEvenOdd(10);

        if (bRet == true)
        {
            System.out.println("The Number is an Even Number");
        }
        else
        {
            System.out.println("The Number is an Odd Number");
        }
    }
}