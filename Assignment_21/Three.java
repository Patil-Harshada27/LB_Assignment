////////////////////////////////////////////////////////////
//
//  File name :     Three.java
//  Description :   To display all factors of a given number
//  Author :         harshada patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        System.out.println("Factors of " + iNo + " are:");

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class three
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 12;

        lobj.DisplayFactors(iValue);
    }
}