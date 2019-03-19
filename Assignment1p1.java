import java.util.Scanner;
public class Assignment1p1
{
    public static void main(String[] args)
    {
        float x, y;
        Scanner keyboard = new Scanner(System.in);

        
        System.out.println("Type in the first number you want to use.");
        x = keyboard.nextFloat();
        System.out.println("Type in the second number you want to use.");
        y = keyboard.nextFloat();

        //Sum
        float sumNumber = (x + y);
        //Difference
        float diffNumer = (x-y);
        //Product
        float prodNumber = (x*y);
        //Quotient
        float quotNumber = (x/y);
        //Remainder
        float remainNumber = (x%y);

        System.out.println("Sum is " + sumNumber);    
        System.out.println("Difference is " + diffNumer);    
        System.out.println("Product is " + prodNumber);    
        System.out.println("Quotient is " + quotNumber);    
        System.out.println("Remainder is " + remainNumber);    

        //Radius Section
        float a;
        System.out.println();
        System.out.println("Please input a number for the radius:");
        a = keyboard.nextFloat();

        double aRea = (3.14*(a*a));
        double circumF = (2*3.14*a);

        System.out.println("The area is " + aRea);
        System.out.println("The circumference is " + circumF);

    }
}