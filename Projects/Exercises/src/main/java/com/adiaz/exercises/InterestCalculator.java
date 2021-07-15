/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.exercises;

import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class InterestCalculator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String year = "";
        String amountPrincipal = "";
        String interestRate = "";
        
        int yearInt = 0;
        double amountPrincipalDouble = 0;
        double interestRateDouble = 0;
        double interestRateQuarter = 0;
        
        //User's input
        System.out.println("How much do you want to invest?");
        amountPrincipal = scan.nextLine();
        amountPrincipalDouble = Double.parseDouble(amountPrincipal);
        
        System.out.println("How many years are you investing?");
        year = scan.nextLine();
        yearInt = Integer.parseInt(year);
        
        System.out.println("What is the annual interest rate % growth?");
        interestRate = scan.nextLine();
        interestRateDouble = Double.parseDouble(interestRate);
        interestRateQuarter = interestRateDouble / 4;
        
        System.out.println("Calculating...");
        
        //Go through and dispaly stats for year.
        for(int i = 1; i <= yearInt; i++) {
            //Print year and amount started with.
            System.out.println("\nYear " + i + ":");
            System.out.printf("Began with $%.2f", amountPrincipalDouble);
            
            //Calculate current amount made for year.
            double amountStarted = amountPrincipalDouble;
            for(int j = 0; j < 4; j++) {
                amountPrincipalDouble *= (1 + (interestRateQuarter / 100));
            }
           
            
            //Print earned and amount principal.
            System.out.printf("\nEarned $%.2f", (amountPrincipalDouble - amountStarted));
            System.out.printf("\nEnded with $%.2f", amountPrincipalDouble);
            System.out.println();
            
        }
        
                
    }
}
