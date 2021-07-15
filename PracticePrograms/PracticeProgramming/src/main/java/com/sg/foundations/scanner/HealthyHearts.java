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
public class HealthyHearts {
    public static void main(String[] args) {
        String age;
        
        int ageInt;
        int heartRate;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = scan.nextLine();
        ageInt = Integer.parseInt(age);
        
        heartRate = 220 - ageInt;
        
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + (int)(heartRate * 0.50) + " - " + (int)(heartRate * 0.85) + " beats per minute.");
    }
}
