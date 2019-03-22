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
           playerTurns = 10;
           boolean gameWon = false;
           int totalTries = 0;
           pickedNumber = (int) (Math.random() * 100);
           System.out.println("Guess a number that's between 1-100.");
           while (!gameWon && totalTries < playerTurns) {
               playerGuess = keyboard.nextInt();
               totalTries++;
               if (playerGuess == pickedNumber) {
                   System.out.println("You won!");
                   System.out.println("It took you " + totalTries + " turns to guess my number, which was " + pickedNumber + "!");
                   System.out.println("Thank you for playing.");
                   gameWon = true;
               }
           }
       }

       



   }

}
