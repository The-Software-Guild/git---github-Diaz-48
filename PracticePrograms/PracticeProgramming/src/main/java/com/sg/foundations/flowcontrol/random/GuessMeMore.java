/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class GuessMeMore {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int number = rand.nextInt(200) - 100;
        String userGuess = "";
        int userGuessInt = 0;
        boolean flag = true;
        
        
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        
        do {
            System.out.println("Your guess:");
            userGuess = scan.nextLine();
            userGuessInt = Integer.parseInt(userGuess);

            if(userGuessInt > number) {
                System.out.println();
                System.out.println(userGuessInt + "? Too bad, way too high. Try again!");
            }
            else if(userGuessInt < number) {
                System.out.println();
                System.out.println(userGuessInt + "? Ha, nice try -- too low! Try again");
            }
            else {
                System.out.println();
                System.out.println(userGuessInt + "? Wow nice guess! That was it!");
                flag = false;
            }
        }while(flag);
    
    }
}
