////////////////////////////////////////////////////////////
// 
//  File name :     Two.java
//  Description :   To display grade of a student based on 
//                  the student's marks
//  Author :        harshada anil patil
//  Date :          03/11/2025
//
////////////////////////////////////////////////////////////

class Logic
{
    char DisplayGrade(int iMarks)
    {
        char cGrade;

        if (iMarks >= 90 && iMarks <= 100)
        {
            cGrade = 'A';
        }
        else if (iMarks >= 75 && iMarks < 90)
        {
            cGrade = 'B';
        }
        else if (iMarks >= 60 && iMarks < 75)
        {
            cGrade = 'C';
        }
        else if (iMarks >= 40 && iMarks < 60)
        {
            cGrade = 'D';
        }
        else
        {
            cGrade = 'F'; 
        }

        return cGrade;
    }
}

class two
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        int iMarks = 82;

        char cGrade = lobj.DisplayGrade(iMarks);
        System.out.println("Grade: " + cGrade);
    }
}