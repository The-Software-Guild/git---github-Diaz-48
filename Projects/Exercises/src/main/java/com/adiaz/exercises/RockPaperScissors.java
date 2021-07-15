/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        //Variables.
        String rounds = "";
        String userChoice = "";
        String userPlay = "";
        
        int roundsNum = 0;
        int userChoiceNum = 0;
        int botChoice = 0;
        
        
        //Keep game playing as long as the user would like to.
        do {
            //User's input for rounds.
            System.out.println("How many rounds would you like to play? (1-10)");
            rounds = scan.nextLine();
            roundsNum = Integer.parseInt(rounds);

            //If the user chose something outside of the range (1, 10).
            if(roundsNum < 1 || roundsNum > 10) {
                System.out.println("ERROR: The amount of rounds provided is outside of the given range.");
            }
            else {
                //Reset the stats before the game starts.
                int ties = 0;
                int userWins = 0;
                int botWins = 0;
                //Loop through each round.
                for(int i = 1; i <= roundsNum; i++) {

                    //User's selection.
                    System.out.println();
                    System.out.println("Do you choose Rock, Paper, or Scissors?");
                    userChoice = scan.nextLine();
                    
                    //Switch case for the user's input.
                    switch(userChoice) {
                        case "Rock":
                            userChoiceNum = 1;
                            break;
                        case "Paper":
                            userChoiceNum = 2;
                            break;
                        case "Scissors":
                            userChoiceNum = 3;
                            break;
                        default:
                            System.out.println("Could not verify your selection.");
                            userChoiceNum = 0;
                            break;
                    }

                    //Bot's choice.
                    botChoice = rand.nextInt(3) + 1;
                    System.out.println("BOT: " + botChoice);

                    //Compare the user and bot's choice.
                    if(userChoiceNum == 1) {
                        if(botChoice == 1) {
                            System.out.println("Tie!");
                            ties += 1;
                        }
                        else if(botChoice == 2) {
                            System.out.println("Bot wins!");
                            botWins += 1;
                        }
                        else {
                            System.out.println("User wins!");
                            userWins += 1;
                        }
                    }
                    else if(userChoiceNum == 2) {
                        if(botChoice == 1) {
                            System.out.println("User wins!");
                            userWins += 1;
                        }
                        else if(botChoice == 2) {
                            System.out.println("Tie!");
                            ties += 1;
                        }
                        else {
                            System.out.println("Bot wins!");
                            botWins += 1;
                        }
                    }
                    else if(userChoiceNum == 3) {
                        if(botChoice == 1) {
                            System.out.println("Bot wins!");
                            botWins += 1;
                        }
                        else if(botChoice == 2) {
                            System.out.println("User wins!");
                            userWins += 1;
                        }
                        else {
                            System.out.println("Tie!");
                            ties += 1;
                        }
                    }
                }

                //Print stats of the game.
                System.out.println();
                System.out.println("User's wins: " + userWins);
                System.out.println("Bot's wins: " + botWins);
                System.out.println("Ties: " + ties);

                //Determine the winner.
                if(userWins > botWins) {
                    System.out.println("The user has won the game!");
                }
                else if (userWins < botWins) {
                    System.out.println("The bot has won the game!");
                }
                else {
                    System.out.println("It's a tie!");
                }
            }

            //Prompt user if they'd like to continue playing.
            System.out.println();
            System.out.println("Would you like to play again?");
            userPlay = scan.nextLine();
            
        }while(userPlay.equals("Yes"));
        
        System.out.println("Thanks for playing!");
    }
}
