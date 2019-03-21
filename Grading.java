public class Grading
{
    private double quizA, quizB, quizC, midterm, finalTest, overallScore;
    private String Grade;
    
    private double x;
    // ((90 < x) && (x <= 100 ))
    // ((80 < x) && (x <= 89 ))
    // ((70 < x) && (x <= 79 ))
    // ((60 < x) && (x <= 69 ))
    // (x <= 59 );

    public Grading(int userquizA, int userquizB, int userquizC)
    {
        quizA = ((userquizA/10)/100);
        quizB = ((userquizB/10)/100);
        quizC = ((userquizC/10)/100);
    }
    public Grading(double userMidterm,double userFinal)
    {
        midterm = (userMidterm/100);
        finalTest = (userFinal/100);
    }
    public double calcQuiz()
    {
        double quizTotal = (((quizA/3)+(quizB/3)+(quizC/3))*(25));
        return(quizTotal);
    }

    public void calcOverall()
    {
        overallScore = ((midterm*35) + (finalTest*40) + (calcQuiz()));
        x = overallScore;
    }

    public String getLetter()
    {
        if (((90 < x) && (x <= 100 )))
        {
            return(System.out.println("A"));
        }
    }
    // public boolean equals()
    // {
    //     if((overallScore.equals(C)))
    //     {
    //         return;
    //     }
    // }

    public String toString()
    {
        return("The grade you got is " + equals());
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
