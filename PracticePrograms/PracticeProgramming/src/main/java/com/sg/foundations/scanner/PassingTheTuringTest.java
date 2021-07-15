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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        String name;
        String color;
        String food;
        int number;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.println("What's your name? ");
        name = scan.nextLine();
        
        System.out.println();
        System.out.println("Hi, " + name + "! I'm Anthony.");
        System.out.println("What's your favorite color? ");
        color = scan.nextLine();
        
        System.out.println();
        System.out.println("Huh, " + color + "? Mine's Electric Lime.");
        
        System.out.println();
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + name + "?");
        food = scan.nextLine();
        
        System.out.println();
        System.out.println("Really? " + food + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number? ");
        number = scan.nextInt();
        
        System.out.println();
        System.out.println(number + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + number + " * -7 is " + (number * -7) + "? That's a cool number too!");
        
        System.out.println();
        System.out.println("Well, thanks for talking to me, " + name + "!");
        
    }
}
