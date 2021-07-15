/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Anthony Diaz
 */
public class LazyTeenager {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        int counter = 0;
        boolean flag = true;
        
        do {
            
            counter += 1;
            
            if(counter == 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            else {
                System.out.println("Clean your room!! (x" + counter + ")");
                int chance = rand.nextInt(100) + 1;
                System.out.println(chance);
                if(chance <= (counter * 10)) {
                    System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT PEAS.");
                    flag = false;
                }
            }
            
        }while(flag);
    }
}
