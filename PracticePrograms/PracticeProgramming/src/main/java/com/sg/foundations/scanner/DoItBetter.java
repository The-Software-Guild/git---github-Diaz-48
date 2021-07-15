/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class DoItBetter {
    
    public static void main(String[] args) {
        String miles;
        String hotDogs;
        String languages;
        
        int milesInt;
        int hotDogsInt;
        int languagesInt;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        miles = scan.nextLine();
        milesInt = Integer.parseInt(miles);
        
        System.out.println("How many hot dogs can you eat?");
        hotDogs = scan.nextLine();
        hotDogsInt = Integer.parseInt(hotDogs);
        
        System.out.println("How many languages do you know?");
        languages = scan.nextLine();
        languagesInt = Integer.parseInt(languages);
        
        System.out.println("I can do more by runnning " + (milesInt * 2 + 1) + " miles, eating " + (hotDogsInt * 2 + 1) + " hot dogs, and speaking " + (languagesInt * 2 + 1) + " languages!");
    }
    
}
