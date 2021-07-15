/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Anthony Diaz
 */
public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        //The random number generated will change from (0, 101) to (50, 101)
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(30) + ", ");
        System.out.print(randomizer.nextInt(60) + 25 + ", ");
        System.out.print(randomizer.nextInt(9) + ", ");
        System.out.print(randomizer.nextInt(150) + ", ");
        System.out.println(randomizer.nextInt(1));
        
        //You can include random numbers in a math statement.
        //Results: 82, 18, 42, 0, 37, 0
    }
}
