/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.collectionsandmaps;

import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class UserIOClass implements UserIO{

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        Scanner scan = new Scanner(System.in);
        String value;
        
        System.out.println(prompt);
        value = scan.nextLine();
        return value;
    }

    @Override
    public int readInt(String prompt) {
        Scanner scan = new Scanner(System.in);
        String value;
        int valueNum;
        
        System.out.println(prompt);
        value = scan.nextLine();
        
        valueNum = Integer.parseInt(value);
        
        return valueNum;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner scan = new Scanner(System.in);
        String value;
        int valueNum;
        
        do {
            System.out.println(prompt);
            value = scan.nextLine();

            valueNum = Integer.parseInt(value);
        }while(valueNum < min || valueNum > max);
        
        return valueNum;
    }

    @Override
    public double readDouble(String prompt) {
        Scanner scan = new Scanner(System.in);
        String value;
        double valueNum;
        
        System.out.println(prompt);
        value = scan.nextLine();
        
        valueNum = Double.parseDouble(value);
        
        return valueNum;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner scan = new Scanner(System.in);
        String value;
        double valueNum;
        
        do {
            System.out.println(prompt);
            value = scan.nextLine();

            valueNum = Double.parseDouble(value);
        }while(valueNum < min || valueNum > max);
        
        return valueNum;
    }

    @Override
    public float readFloat(String prompt) {
        Scanner scan = new Scanner(System.in);
        String value;
        float valueNum;
        
        System.out.println(prompt);
        value = scan.nextLine();
        
        valueNum = Float.parseFloat(value);
        
        return valueNum;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner scan = new Scanner(System.in);
        String value;
        float valueNum;
        
        do {
            System.out.println(prompt);
            value = scan.nextLine();

            valueNum = Float.parseFloat(value);
        }while(valueNum < min || valueNum > max);
        
        return valueNum;
    }
    
}
