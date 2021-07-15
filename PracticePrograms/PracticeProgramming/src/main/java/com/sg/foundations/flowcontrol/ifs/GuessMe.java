/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class GuessMe {
    public static void main(String[] args) {
        int number = 10;
        
        String userGuess;
        int userGuessInt;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        
        System.out.println("Your guess:");
        userGuess = scan.nextLine();
        userGuessInt = Integer.parseInt(userGuess);
        
        if(userGuessInt > number) {
            System.out.println(userGuessInt + "? Too bad, way too high. I chose #" + number);
        }
        else if(userGuessInt < number) {
            System.out.println(userGuessInt + "? Ha, nice try -- too low! I chose #" + number);
        }
        else {
            System.out.println(userGuessInt + "? Wow nice guess! That was it!");
        }
    }
        
}
