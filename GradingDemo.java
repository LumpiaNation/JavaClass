import java.util.Scanner;
public class GradingDemo
{
    public static void main(String[] args)
    {
    
        int userquizA, userquizB, userquizC;
        double userMidterm, userFinal;
            
        Scanner keyboard = new Scanner(System.in);

        System.out.println();
        System.out.println("How many points did you get on your three quizzes?");

        userquizA = keyboard.nextInt();
        userquizB = keyboard.nextInt();
        userquizC = keyboard.nextInt();

        System.out.println();
        System.out.println("What is your midterm score?");
        userMidterm = keyboard.nextInt();
        
        System.out.println();
        System.out.println("What score did you get on the final?");
        userFinal = keyboard.nextInt();

        Grading g1 = new Grading(userquizA, userquizB, userquizC, userMidterm,userFinal);
        
        System.out.println(g1);

    }
}