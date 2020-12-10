/* @file BlackJack.java
@brief Using loops to create a Black Jack game.
@author Sara Barker
@date 9/21/2018 */

import java.util.Scanner;
import java.util.Random;

public class BlackJack {
    public static void main(String[] args) {

        //variable declarations
        String choice;
        int winner = 0;
        int totalDealer = 0;
        int totalUser = 0;
        char answer = 'y';
        int playerWins = 0;
        int dealerWins = 0;

        //random number generator
        Random rand = new Random();
        Scanner user = new Scanner(System.in);

        int cardUser = rand.nextInt(11)+1;
        int cardDealer = rand.nextInt(11)+1;

        //calculations
        totalUser = totalUser + cardUser;
        totalDealer = totalDealer + cardDealer;

        //in case they want to play another round!
        while (answer == 'y') {

            totalDealer = 0;
            totalUser = 0;

            //instructions & scores
            System.out.println("Welcome to Black Jack!");
            System.out.println("Player's turn...");
            System.out.println("Card: " + cardUser);
            totalUser = totalUser + cardUser;
            System.out.println("Current score: " + totalUser);

            //asking for input
            System.out.println("Select: (h) Hit me again! or (d) I’m done.");
            choice = user.next();

            //player loop
            while (choice.equals("h")) {
                cardUser = rand.nextInt(11) + 1;
                totalUser = totalUser + cardUser;

                //instructions & scores
                System.out.println("Player's turn...");
                System.out.println("Card: " + cardUser);
                System.out.println("Current score: " + totalUser);

                //asking for input
                System.out.println("Select: (h) Hit me again! or (d) I’m done.");
                choice = user.next();
            }

            System.out.println("Player's total score is: " + totalUser);

            //dealer loop
            while (totalDealer <= 17) {
                cardDealer = rand.nextInt(11) + 1;
                totalDealer = totalDealer + cardDealer;

                System.out.println("Dealer's turn...");
                System.out.println("Card: " + cardDealer);
                System.out.println("Current score: " + totalDealer);
            }

            System.out.println("Dealer's total score is: " + totalDealer);

            //declaring winner
            if (totalDealer > totalUser && totalDealer <= 21) {
                System.out.println("Dealer wins!");
                dealerWins = dealerWins + 1;
            }
            else if (totalUser > totalDealer && totalUser <= 21) {
                System.out.println("Player wins!");
                playerWins = playerWins + 1;
            }
            else if (totalUser == totalDealer) {
                System.out.println("It's a tie!");
            }
            else if (totalDealer >= 21) {
                System.out.println("It's a tie!");
            }

            System.out.println("Want to play again? (y/n)");
            answer = user.next().charAt(0);
        }

        System.out.println("Player won " + playerWins + " time(s).");
        System.out.println("Dealer won " + dealerWins + " time(s).");

    }
}


