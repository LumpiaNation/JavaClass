public class Grading
{
    double quizA, quizB, quizC, midterm, finalTest, overallScore;
    String Grade;
    
    double x;
    Boolean A = ((90 < x) && (x <= 100 ));
    Boolean B = ((80 < x) && (x <= 89 ));
    Boolean C = ((70 < x) && (x <= 79 ));
    Boolean D = ((60 < x) && (x <= 69 ));
    Boolean F = (x <= 59 );

    public Grading(int userquizA, int userquizB, int userquizC)
    {
        quizA = (userquizA/100);
        quizB = (userquizB/100);
        quizC = (userquizC/100);
    }
    public Grading(double userMidterm,double userFinal)
    {
        midterm = (userMidterm/100);
        finalTest = (userFinal/100);
    }

    public void calcOverall()
    {
        overallScore = ((midterm*35) + (finalTest*40) + (/*quiz here*/));
    }

    public void calcLetter()
    {
        if(())
    }

    public String toString()
    {
        return("The grade you got is " + Grade);
    }



    
}

// For the equals method just have the overall score equal to a variable
//then cross check for it to see if it matches any of the boolean values


// Constructors
//Quizzes
//Midterm and Final


// Methods
// Compute overall numeric grade
// Computer Final Letter Grade (this can be set to the equals method)

// Process
// User inputs the grades
// All grades get converted
// Grades get calculated
// Number calculated gets assigned
// Number assigned gets cross checked with each of the Grade letters
// System prints out the output
