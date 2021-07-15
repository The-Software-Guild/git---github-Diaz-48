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
public class MiniMadLibs {
    public static void main(String[] args) {
        String nounOne;
        String adjectiveOne;
        String nounTwo;
        String numberOne;
        String adjectiveTwo;
        String pluralNounOne;
        String pluralNounTwo;
        String pluralNounThree;
        String verbOne;
        String verbTwo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!\n");
        
        System.out.println("I need a noun:");
        nounOne = scan.nextLine();
        
        System.out.println("Now an adjective:");
        adjectiveOne = scan.nextLine();
        
        System.out.println("Another noun:");
        nounTwo = scan.nextLine();
        
        System.out.println("And a number:");
        numberOne = scan.nextLine();
        
        System.out.println("Another adjective:");
        adjectiveTwo = scan.nextLine();
        
        System.out.println("A plural noun:");
        pluralNounOne = scan.nextLine();
        
        System.out.println("Another one:");
        pluralNounTwo = scan.nextLine();
        
        System.out.println("One more:");
        pluralNounThree = scan.nextLine();
        
        System.out.println("A verb (infinitive form):");
        verbOne = scan.nextLine();
        
        System.out.println("Same verb (past participle):");
        verbTwo = scan.nextLine();
        
        System.out.println("\n*** NOW LETS GET MAD (libs) ***");
        System.out.println(nounOne + ": the " + adjectiveOne + " frontier. These are the voyages of the starship " + nounTwo + 
                ". Its " + numberOne + "-year mission: to explore strange " + adjectiveTwo + " " + pluralNounOne + ", to seek out " + adjectiveTwo + 
                " " + pluralNounTwo + " and " + adjectiveTwo + " " + pluralNounThree + ", to boldly " + verbOne + 
                " where no one has " + verbTwo + " before.");
        
    }
}
