
  //Vanessa Espino Module 2.2 CSD402
  //write a program that is like rock, paper, scissors game

import java.util.Scanner;
import java.util.Random;


public class EspinoMod22CSD402 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        
     //Generate computer choice (1, 2, or 3)
    int computerChoice = random.nextInt(3) + 1;


    //Prompt user for input
    System.out.println("Let's play Rock-Paper-Scissors!");
    System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
    int userChoice = input.nextInt();

    //Display choices 
    System.out.println("\nYou chose: " + getChoiceName(userChoice));
    System.out.println("Computer chose: " + getChoiceName(computerChoice));


    //Display and compare results
    if (userChoice == computerChoice) {
        System.out.println("It's a tie!");
    } else if ((userChoice == 1 && computerChoice == 3) ||
               (userChoice == 2 && computerChoice == 1) ||
               (userChoice == 3 && computerChoice == 2)) {
        System.out.println ("Congrats! You win!");
    } else {
        System.out.println("Computer wins! Try again!");
    }

    input.close();
   }


    public static String getChoiceName(int choice) {
          switch (choice) {
            case 1: return  "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid Selection";
        }

    }
}
