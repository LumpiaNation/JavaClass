import java.util.Scanner;
public class Assignment1p2
{
    // Set A
    // 1.
    // Output == How do you doSeven of Nine

    // 2.
    // Output == 7

    // 3.
    // Output == defg

    // 4.
    // Output == 
    //     abc
    //     def

    // 5.
    // Output ==
    //     abc\ndef
    
    // 6. 
    // Output == HELLO JOHN

    // Set B
    // 1.
    // Output == false

    // 2.
    // Output == false

    // 3.
    // Output == true

    public static void main (String[] args)
    {
        double dollarTen = 10;
        double dollarFive = 5;
        double dollarOn = 1;
        double coinFifty = .50;
        double coinQuarter = .25;
        double coinDime = .10;
        double coinPenny = .01;
        double userTen, userFive, userOne, userFifty, userQuarter, userDime, userPenny;

        Scanner keyboard = new Scanner(System.in);         
        System.out.println("How many Tens?");
        userTen = keyboard.nextInt();
        System.out.println("How many Fives?");
        userFive = keyboard.nextInt();
        System.out.println("How many Ones?");
        userOne = keyboard.nextInt();
        System.out.println("How many 50 Cent Coins?");
        userFifty = keyboard.nextInt();
        System.out.println("How many Quarters?");
        userQuarter = keyboard.nextInt();
        System.out.println("How many Dimes?");
        userDime = keyboard.nextInt();
        System.out.println("How many Pennies?");
        userPenny = keyboard.nextInt();

        double total = ((userTen*dollarTen) + (userFive*dollarFive) + (userOne*dollarOn) + (userFifty*coinFifty)+ (userQuarter*coinQuarter) + (userDime*coinDime) + (userPenny*coinPenny));
        System.out.println("The total is $");
        System.out.printf("%3.2f",total);



        
    }

}