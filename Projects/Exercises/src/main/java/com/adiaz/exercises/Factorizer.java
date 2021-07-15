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
public class Factorizer {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //Variables to use.
        String number = "";
        int numberInt = 0;
        int factors = 0;
        
        //Ask user for their input.
        System.out.println("What number would you like to factor?");
        number = scan.nextLine();
        numberInt = Integer.parseInt(number);
        
        //Get factor numbers.
        factors = getFactorNumbers(numberInt);
        
        //Finds if the number is perfect.
        boolean isPerfect = isPerfectNumber(numberInt);
        
        if(isPerfect == true) {
            System.out.println(numberInt + " is a perfect number.");
        }
        else {
            System.out.println(numberInt + " is not a perfect number.");
        }
        
        if (factors <= 2) {
            System.out.println(numberInt + " is a prime number.");
        }
        else {
            System.out.println(numberInt + " is not a prime number.");
        }
        
        
        
        
    }
    
    /**
     * 
     * @param num: The number to find factors of.
     */
    public static int getFactorNumbers(int num) {
        //Keep tracks of how many factors.
        int count = 0;
        
        System.out.println("The factors of " + num + " are:");
        //Go through each number, 1 - num
        for(int i = 1; i <= num; i++) {
            if((num % i) == 0) {
                count += 1;
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n" + num + " has " + count + " factors.");
        
        return count;
    }
    
    /**
     * 
     * @param num: The number to determine if it is perfect.
     * @return: True/False if the number is a perfect number.
     */
    public static boolean isPerfectNumber(int num) {
        //Keep track of total count.
        int count = 0;
        
        //Go through each number, 1 - (num-1)
        for(int i = 1; i < num; i++) {
            if((num % i) == 0) {
                count += i;
            }
        }
        
        //If total count is the number, then it's perfect.
        if(count == num) {
            return true;
        }
        else {
            return false;
        }
    }
}
