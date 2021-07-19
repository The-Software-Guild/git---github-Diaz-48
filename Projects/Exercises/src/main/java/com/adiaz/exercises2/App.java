/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.exercises2;

import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();
        
        String userInput;
        int userInputNum;
        String x;
        String y;
        int xNum;
        int yNum;
        
        System.out.println("Welcome to your calculator");
        
        do {
            
            //Get user's input from menu.
            System.out.println("\n1. Add\n2. Subract\n3. Multiply\n4. Divide\n5. Exit");
            userInput = scan.nextLine();
            
            //Try to convert input to number, otherwise display error message and continue program.
            try {
                userInputNum = Integer.parseInt(userInput);
                
                if(userInputNum < 1 || userInputNum > 5) {
                    System.out.println("Sorry, that option isn't available.");
                    continue;
                }
                else if(userInputNum == 5) {
                    System.out.println("Thank you for your time.");
                    continue;
                }
            }
            catch (Exception e) {
                System.out.println("The value entered is not a number. Please try again");
                userInputNum = 0;
                continue;
            }
            
            //Get user's input for first number.
            System.out.println("Please enter the first number:");
            x = scan.nextLine();
            
            //Try to convert the input to number, otherwise display error message and continue program.
            try {
                xNum = Integer.parseInt(x);
            }
            catch (Exception e) {
                System.out.println("The value entered is not a number. Please try again");
                userInputNum = 0;
                continue;
            }
            
            //Get user's input for second number.
            System.out.println("Please enter the second number:");
            y = scan.nextLine();
            
            //Try to convert the input to number, otherwise display error message and continue program.
            try {
                yNum = Integer.parseInt(y);
            }
            catch (Exception e) {
                System.out.println("The value entered is not a number. Please try again");
                userInputNum = 0;
                continue;
            }
            
            //Check their input.
            if(userInputNum == 1) {
                System.out.println(calc.add(xNum, yNum));
            }
            else if(userInputNum == 2) {
                System.out.println(calc.subtract(xNum, yNum));
            }
            else if(userInputNum == 3) {
                System.out.println(calc.multiply(xNum, yNum));
            }
            else if(userInputNum == 4) {
                System.out.println(calc.divide(xNum, yNum));
            }
            
            
        }while(userInputNum != 5);
        
        
    }
}
