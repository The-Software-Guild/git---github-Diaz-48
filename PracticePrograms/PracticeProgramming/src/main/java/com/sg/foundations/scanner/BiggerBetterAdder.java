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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        String numOne;
        String numTwo;
        String numThree;
        int numOneInt;
        int numTwoInt;
        int numThreeInt;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the first number:");
        numOne = scan.nextLine();
        numOneInt = Integer.parseInt(numOne);
        
        System.out.println("Please enter the second number:");
        numTwo = scan.nextLine();
        numTwoInt = Integer.parseInt(numTwo);
        
        System.out.println("Please enter the third number:");
        numThree = scan.nextLine();
        numThreeInt = Integer.parseInt(numThree);
        
        int sum = numOneInt + numTwoInt + numThreeInt;
        
        System.out.println(numOne + " + " + numTwo + " + " + numThree + " = " + sum);
    }
}
