public class Grading
{
    private double quizA, quizB, quizC, midterm, finalTest, overallScore;
    private String Grade;
    private String passIng;
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
        
        if ((90 < x) && (x <= 100 ))
        {
            Grade = "A";
        }
        else if(((80 < x) && (x <= 89 )))
        {
            Grade = "B";
        }
        else if((70 < x) && (x <= 79 ))
        {
            Grade = "C";
        }
        else if((60 < x) && (x <= 69 ))
        {
            Grade = "D";
        }
        else if(x <= 59 )
        {
            Grade = "F";
        }
        return(Grade);
    }
    public Boolean equals()
    {
        if((Grade == "C") || (Grade == "B") || (Grade == "A") )
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    public String passGrade()
    {
        if (equals() == true)
        {
            passIng = ("have passed!");
        }
        else
        {
            passIng = ("have not passed.");
        }
        return(passIng);
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
        return("The grade Gradeo got is " + Grade + " and you " +);
    }



    
}

// Equals Method: Setup will be different and will instead return a true or false
//value and if true the toString will return passed, if not true the toString will return false
//toString will invoke the method to check for true or false


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
// SGradestem prints out the output
