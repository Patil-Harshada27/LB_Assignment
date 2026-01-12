////////////////////////////////////////////////////////////
//
//  File name :     five.java
//  Description :   To check whether the number is divisible 
//                  by 2 or 3
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    void CheckDivisibleby2and3(int iNo)
    {
        if ((iNo % 2 == 0) && (iNo % 3 == 0))
        {
            System.out.println(iNo + " is divisible by both 2 and 3");
        }
        else if (iNo % 2 == 0)
        {
            System.out.println(iNo + " is divisible by 2 only");
        }
        else if (iNo % 3 == 0)
        {
            System.out.println(iNo + " is divisible by 3 only");
        }
        else
        {
            System.out.println(iNo + " is not divisible by 2 or 3");
        }
    }
}

class five
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 30;

        lobj.CheckDivisibleby2and3(iValue);
    }
}