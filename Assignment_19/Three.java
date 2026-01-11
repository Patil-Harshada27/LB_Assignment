
////////////////////////////////////////////////////////////
// 
//  File name :     Three.java
//  Description :   To check whether the number is divisible 
//                  by 5 or 11
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    void CheckDivisibile(int iNo)
    {
        if ((iNo % 5 == 0) && (iNo % 11 == 0))
        {
            System.out.println(iNo + " is divisible by both 5 and 11");
        }
        else if (iNo % 5 == 0)
        {
            System.out.println(iNo + " is divisible by 5 only");
        }
        else if (iNo % 11 == 0)
        {
            System.out.println(iNo + " is divisible by 11 only");
        }
        else
        {
            System.out.println(iNo + " is not divisible by 5 or 11");
        }
    }
}

class three
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 55;

        lobj.CheckDivisibile(iValue);
    }
}