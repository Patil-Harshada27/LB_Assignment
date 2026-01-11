////////////////////////////////////////////////////////////
// 
//  File name :     Four.java
//  Description :   To print each digit of a number separately
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        if (iNo < 0)
        {
            iNo = -iNo;    
        }

        System.out.println("Digits of the number are:");

        while (iNo != 0)
        {
            iDigit = iNo % 10;   
            System.out.println(iDigit);
            iNo = iNo / 10;      
        }
    }
}

class four
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 9876;

        lobj.DisplayDigits(iValue);
    }
}