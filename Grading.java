public class Grading
{
    private double quizA, quizB, quizC, midterm, finalTest, overallScore;
    private String Grade;
    private String passIng, gradeTemp;
    private double x, quizTotal;
    // ((90 < x) && (x <= 100 ))
    // ((80 < x) && (x <= 89 ))
    // ((70 < x) && (x <= 79 ))
    // ((60 < x) && (x <= 69 ))
    // (x <= 59 );

    //Constructor
    public Grading(int userquizA, int userquizB, int userquizC,double userMidterm,double userFinal)
    {
        quizA = ((userquizA));
        quizB = ((userquizB));
        quizC = ((userquizC));       
         midterm = (userMidterm);
        finalTest = (userFinal);

    }

    public double calcQuiz()
    {
        quizTotal = (((quizA)+(quizB)+(quizC))*(.25));
        return(quizTotal);
    }

    public void calcOverall()
    {

        overallScore = ((midterm*.35) + (finalTest*.40) + (quizTotal));
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
        gradeTemp = Grade;
        return(Grade);
    }
    public Boolean equals()
    {
        if((gradeTemp == "C") || (gradeTemp == "B") || (gradeTemp == "A") )
        {
            return(true); 
        }
        else if(gradeTemp == "D" || gradeTemp == "F");
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
        calcQuiz();
        calcOverall();
        getLetter();
        equals();

        return("The grade Grade you got is " + Grade + " and you " + passGrade());
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
