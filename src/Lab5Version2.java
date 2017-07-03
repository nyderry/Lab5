import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ny Derry on 7/2/2017.
 */
public class Lab5Version2 {
    public static void main(String[] args) {
        char contin1 = 'y';
        String contin2 = "";
        int i = 1;

        //1. display welcome message
        System.out.println("Welcome to the Grand Circus Casino!");
        System.out.println(" ");

        //2. prompt for user input


        //while loop to continue rolling
        while (contin1 != 'n') {

            //3. get user input
            Scanner scnr = new Scanner(System.in);
            // int userInput = 0;
            System.out.print("How many sides should each dice have? ");
            int userInput = scnr.nextInt();
            System.out.println(" ");


            Random randGen = new Random();
            System.out.println("Roll " + i + ":");
            //4. result of user input
            System.out.println(randGen.nextInt(userInput) + 1);
            System.out.println(randGen.nextInt(userInput) + 1);
            ++i;
            System.out.println(" ");

            //5. display result


            //6. prompt user to play again
            System.out.print("Roll again? (y/n): ");
            //  Scanner scan = new Scanner(System.in);
            // String contin2 = scan.nextLine();
            // Scanner scnr = null;

            contin2 = scnr.next();
            contin1 = contin2.charAt(0);
            System.out.println(" ");


        }
    }
}