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
public class HealthyHearts {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Variables for program.
        String age;
        int ageInt;
        int heartRate;
        double minBeats;
        double maxBeats;

        //User inputs age.
        System.out.println("What is your age?");
        age = scan.nextLine();
        ageInt = Integer.parseInt(age);
        
        //Heart rate calculations.
        heartRate = 220 - ageInt;
        minBeats = 0.50 * heartRate;
        maxBeats = 0.85 * heartRate;
        
        //Print values to the user.
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute.");
        System.out.printf("Your target HR Zone is " + Math.round(minBeats) + " - " + Math.round(maxBeats) + " beats per minute.");
    }
    
}
