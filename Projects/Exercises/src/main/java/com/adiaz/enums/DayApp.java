/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.enums;

import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class DayApp {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String dayStr;
        Day day;
        
        System.out.println("Enter a day of the week:");
        dayStr = scan.nextLine();
        day = Day.valueOf(dayStr);
        
        switch(day) {
            case MONDAY:
                System.out.println("4 day until Friday.");
                break;
            case TUESDAY:
                System.out.println("3 day until Friday.");
                break;
            case WEDNESDAY:
                System.out.println("2 day until Friday.");
                break;
            case THURSDAY:
                System.out.println("1 day until Friday.");
                break;
            case FRIDAY:
                System.out.println("0 day until Friday.");
                break;
            case SATURDAY:
                System.out.println("6 day until Friday.");
                break;
            case SUNDAY:
                System.out.println("5 day until Friday.");
                break;
            default:
                System.out.println("Could not read input.");
        }
    }
}
