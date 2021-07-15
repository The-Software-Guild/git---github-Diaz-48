package com.adiaz.exercises;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony Diaz
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        String dogName;
        int breedOne;
        int breedTwo;
        int breedThree;
        int breedFour;
        int breedFive;
        int breedTotal = 0;
        
        System.out.println("What is your dog's name?");
        dogName = scan.nextLine();
        
        
        //Keep determining breed one as long as new total breed is less than or equal to 96%;
        do {
            breedOne = rand.nextInt(100) + 1;
        }while((breedOne + breedTotal) >= 96);
        breedTotal += breedOne;
        
        //Keep determining breed two as long as new total breed is less than or equal to 97%;
        do {
            breedTwo = rand.nextInt(100) + 1;
        }while((breedTwo + breedTotal) >= 97);
        breedTotal += breedTwo;
        
        //Keep determining breed three as long as new total breed is less than or equal to 98%;
        do {
            breedThree = rand.nextInt(100) + 1;
        }while((breedThree + breedTotal) >= 98);
        breedTotal += breedThree;
        
        //Keep determining breed four as long as new total breed is less than or equal to 99%;
        do {
            breedFour = rand.nextInt(100) + 1;
        }while((breedFour + breedTotal) >= 99);
        breedTotal += breedFour;
        
        //Keep determining breed five as long as new total breed is not 100%;
        do {
            breedFive = rand.nextInt(100) + 1;
        }while((breedFive + breedTotal) != 100);
        breedTotal += breedFive;
        
        //Print out breeds.
        System.out.println("Well then, I have this hightly reliable report on " + dogName + "'s prestigous background right here.");
        System.out.println("\n" + dogName + " is:");
        System.out.println(breedOne + "% St. Bernard");
        System.out.println(breedTwo + "% Chihuahua");
        System.out.println(breedThree + "% Dramatic RedNosed Asian Pug");
        System.out.println(breedFour + "% Common Cur");
        System.out.println(breedFive + "% King Doberman");
        
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
        
        
    }
}
