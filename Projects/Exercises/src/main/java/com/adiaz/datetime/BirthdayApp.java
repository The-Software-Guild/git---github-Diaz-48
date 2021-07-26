/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class BirthdayApp {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        LocalDate ld;
        String birthday;
        DayOfWeek dayOfWeek;
        
        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        
        System.out.println("\nWhat's your birthday?");
        birthday = scan.nextLine();
        
        ld = LocalDate.parse(birthday);
        dayOfWeek = ld.getDayOfWeek();
        
        System.out.println("That means you were born on a " + dayOfWeek + "!");
    }
}
