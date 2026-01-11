////////////////////////////////////////////////////////////
// 
//  File name :     Three.java
//  Description :   To check whether the number is perfect 
//                  number or not
//  Author :        harshada anil patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    boolean CheckPerfect(int iNo)
    {
        int iSum = 0;
        int iCnt = 0;
        for (iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;    
            }
        }

        if (iSum == iNo)
        {
            return true;                
        }
        else
        {
            return false;
        }
    }
}

class three
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iValue = 28;
        boolean bRet = false;

        bRet = lobj.CheckPerfect(iValue);

        if (bRet == true)
        {
            System.out.println(iValue + " is a Perfect Number.");
        }
        else
        {
            System.out.println(iValue + " is not a Perfect Number.");
        }
    }
}