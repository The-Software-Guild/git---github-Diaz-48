/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Anthony Diaz
 */
public class MenuOfChampions {
    
    public static void main(String[] args) {
        
        String foodOne = "Pizza";
        String foodTwo = "Tacos";
        String foodThree = "Cheeseburger";
        
        double foodOnePrice = 4.99;
        double foodTwoPrice = 0.99;
        double foodThreePrice = 5.99;
        
        System.out.println(" _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _\n" +
                            "(_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_)\n");
        System.out.println("        Welcome to Anthony's Restaurant!");
        System.out.println("        Today's menu is...");
        System.out.println(" _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _\n" +
                            "(_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_}{_)\n");
        
        System.out.println("        $ " + foodOnePrice + " *** " + foodOne);
        System.out.println("        $ " + foodTwoPrice + " *** " + foodTwo);
        System.out.println("        $ " + foodThreePrice + " *** " + foodThree);
    }
}
