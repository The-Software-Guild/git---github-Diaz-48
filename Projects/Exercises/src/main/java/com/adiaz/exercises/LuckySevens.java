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
public class LuckySevens {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        //Variables.
        String userDollars = "";
        
        int userDollarsNum = 0;
        int diceOne = 0;
        int diceTwo = 0;
        int rolls = 0;
        int maxAmount = 0;
        int rollsMaxAmount = 0;
        
        //User's starting amount.
        System.out.println("How many dollars do you have?");
        userDollars = scan.nextLine();
        userDollarsNum = Integer.parseInt(userDollars);
        
        maxAmount = userDollarsNum;
        
        //Keep going until the user has no money.
        while(userDollarsNum > 0) {
            //Increase amount of rolls.
            rolls += 1;
            
            //Rolls dice.
            diceOne = rand.nextInt(6) + 1;
            diceTwo = rand.nextInt(6) + 1;
            
            //If the user rolled a 7;
            if((diceOne + diceTwo) == 7) {
                userDollarsNum += 4;
                //If this is the highest amount the user has had.
                if(userDollarsNum > maxAmount) {
                    maxAmount = userDollarsNum;
                    rollsMaxAmount = rolls;
                }
            }
            //User rolled something else.
            else {
                userDollarsNum -= 1;
            }
        }
        
        //Print out stats.
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + rollsMaxAmount + " rolls when you had $" + maxAmount + ".");
        
    }
}
