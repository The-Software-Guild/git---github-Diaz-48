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
public class AllTheTrivia {
    public static void main(String[] args) {
        
        String unit;
        String planet;
        String volcano;
        String element;
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        unit = scan.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        planet = scan.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        volcano = scan.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        element = scan.nextLine();
        
        System.out.println("Wow, 1,024 Gigabtyes is a " + volcano + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + unit + "!");
        System.out.println("That's amazing that " + planet + " is the most abundant element in the atmosphere...");
        System.out.println(element + " is the only planet that rotates clockwise, neat!");
    }
}
