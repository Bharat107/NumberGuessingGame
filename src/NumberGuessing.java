import java.util.Scanner;

public class NumberGuessing {

   public static void main(String[] args){

       Scanner keyboard;
       int pickedNumber;
       int playerGuess;
       int playerTurns;
       String playerChoice;

       boolean play = true;

       keyboard = new Scanner(System.in);
       do {
           playerTurns = 7;
           boolean gameWon = false;
           int totalTries = 0;
           pickedNumber = (int) (Math.random() * 100);
           System.out.println("Guess a number that's between 1-100.");
           while (!gameWon && totalTries < playerTurns) {
               playerGuess = keyboard.nextInt();
               totalTries++;
               if (playerGuess == pickedNumber) {
                   System.out.println("Congratulations, you've won!");
                   System.out.println("It took you " + totalTries + " turns to guess my number, which was " + pickedNumber + "!");
                   System.out.println("Thank you for playing.");
                   gameWon = true;
               }
               else {
                   System.out.println("You have " + (playerTurns-totalTries) + " turns left.");
                   if (playerGuess > pickedNumber) {
                       System.out.print("Your guess, " + playerGuess + " is too high.");
                   } else if (playerGuess < pickedNumber) {
                       System.out.print("Your guess, " +playerGuess + " is too low.");
                   }
               }
               if (totalTries == playerTurns){
                   System.out.println("\nOpps!No turns left. You lose.");
               }
           }
           do {
               System.out.print("Do you want to guess my number again?");
               System.out.print(" Type \"Y or N\"");
               playerChoice = keyboard.next().toLowerCase();
               if (playerChoice.equalsIgnoreCase("y")) {
                   play = true;
               } else if (playerChoice.equalsIgnoreCase("n")) {
                   play = false;
               } else {
                   System.out.println("I do not understand, answer again.");
               }
           } while (!playerChoice.equalsIgnoreCase("y") && !playerChoice.equalsIgnoreCase("n"));
       }while(play);





   }

}
