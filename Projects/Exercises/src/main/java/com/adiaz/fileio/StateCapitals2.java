/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class StateCapitals2 {
    
    public static void main(String[] args) throws Exception {
        //File name and delimeter variables.
        final String FILE_NAME = "StateCapitals.txt";
        final String DELIMETER = "::";
        
        //Collection of states.
        Collection<String> states;
        
        //Variable to store entire line from file.
        String record;
        
        //Hash map for state capitals.
        HashMap<String, String> stateCapitals = new HashMap<>();

        //File reader/input.
        Scanner read = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));
        Scanner scan = new Scanner(System.in);
        
        //Random for the game.
        Random rand = new Random();
        int randNum;
        String randState = "";
        String userGuess;
        
        //Loop through each line.
        while(read.hasNextLine()) {
            record = read.nextLine();
            
            //Split line based on delimeter into array.
            String[] values = record.split(DELIMETER);
            //State/capital.
            String state = values[0];
            String capital = values[1];
            
            //Add to hash map.
            stateCapitals.put(state, capital);
        }
        
        read.close();
        
        System.out.println(stateCapitals.size() + " STATES & CAPITALS ARE LOADED.");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES :");
        
        //Get all states.
        states = stateCapitals.keySet();
        randNum = rand.nextInt(stateCapitals.size());
        int i = 0;
        
        //Display each state.
        
        for(String state : states) {
            i += 1;
            System.out.print(state);
            if(i < 50) {
                System.out.print(", ");
            }
            if(i == randNum) {
                randState = state;
            }
        }

        //Test knowledge game.
        System.out.println("\n\nREADY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPTITAL OF '" + randState + "'?");
        userGuess = scan.nextLine();
        
        if(userGuess.equals(stateCapitals.get(randState))) {
            System.out.println("NICE WORK! " + userGuess + " IS CORRECT!");
        }
        else {
            System.out.println("INCORRECT!");
        }
    }
}
