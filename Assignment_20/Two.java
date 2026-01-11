
////////////////////////////////////////////////////////////
// 
//  File name :     Two.java
//  Description :   To print numbers from N down to 1 in   
//                  reverse order
//  Author :        harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    int iCnt = 0;
    void DisplayReverse(int iNo)
    {
        for (iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class two
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 10;

        System.out.println("Numbers from " + iValue );
        lobj.DisplayReverse(iValue);
    }
}