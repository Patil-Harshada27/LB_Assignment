////////////////////////////////////////////////////////////
// 
//  File name :     one.java
//  Description :   To check whether a given year is a leap 
//                  year or not 
//  Author :        harshada anil patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    void CheckLeapYear(int iYear)
    {
        if (iYear % 400 == 0)
        {
            System.out.println(iYear + " is a Leap Year");
        }
        else if (iYear % 100 == 0)
        {
            System.out.println(iYear + " is not a Leap Year");
        }
        else if (iYear % 4 == 0)
        {
            System.out.println(iYear + " is a Leap Year");
        }
        else
        {
            System.out.println(iYear + " is not a Leap Year");
        }
    }
}

class one
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 2024;

        lobj.CheckLeapYear(iValue);
    }
}