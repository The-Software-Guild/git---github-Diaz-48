/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.Random;

/**
 *
 * @author Anthony Diaz
 */
public class RandomTest {
    
    public static void main(String[] args) {
        Random fixedSeed = new Random(3243242);
        
        int first, next;
        
        first = fixedSeed.nextInt(4);
        next = fixedSeed.nextInt(1);
        
        System.out.println("The first random number is: " + first);
        System.out.println("The next random number is: " + next);
        
        try {
            System.out.println(first / next);
        }
        catch(ArithmeticException e) {
            System.out.println("ERROR: Can't divide by 0!");
            System.out.println(e);
        }
    }
}
