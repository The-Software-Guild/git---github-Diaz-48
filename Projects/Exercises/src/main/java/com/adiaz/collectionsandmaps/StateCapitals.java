/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.collectionsandmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Anthony Diaz
 */
public class StateCapitals {
    public static void main(String[] args) {
        
        //HashMap for states and capitals
        HashMap<String, String> statesHash = new HashMap<>();
        
        statesHash.put("Alabama", "Montgomery");
        statesHash.put("Alaska", "Juneau");
        statesHash.put("Arizona", "Phoenix");
        statesHash.put("Arkansas", "Little Rock");
        statesHash.put("California", "Sacramento");
        statesHash.put("Colorado", "Denver");
        statesHash.put("Connecticut", "Hartford");
        statesHash.put("Delaware", "Dover");
        statesHash.put("Florida", "Tallahassee");
        statesHash.put("Georgia", "Atlanta");
        statesHash.put("Hawaii", "Honolulu");
        statesHash.put("Idaho", "Boise");
        statesHash.put("Illinois", "Springfield");
        statesHash.put("Indiana", "Indianapolis");
        statesHash.put("Iowa", "Des Moines");
        statesHash.put("Kansas", "Topeka");
        statesHash.put("Kentucky", "Frankfort");
        statesHash.put("Louisiana", "Baton Rouge");
        statesHash.put("Maine", "Augusta");
        statesHash.put("Maryland", "Annapolis");
        statesHash.put("Massachusetts", "Boston");
        statesHash.put("Michigan", "Lansing");
        statesHash.put("Minnesota", "Saint Paul");
        statesHash.put("Mississippi", "Jackson");
        statesHash.put("Missouri", "Jefferson City");
        statesHash.put("Montana", "Helena");
        statesHash.put("Nebraska", "Lincoln");
        statesHash.put("Nevada", "Carson City");
        statesHash.put("New Hampshire", "Concord");
        statesHash.put("New Jersey", "Trenton");
        statesHash.put("New Mexico", "Santa Fe");
        statesHash.put("New York", "Albany");
        statesHash.put("North Carolina", "Raleigh");
        statesHash.put("North Dakota", "Bismarck");
        statesHash.put("Ohio", "Columbus");
        statesHash.put("Oklahoma", "Oklahoma City");
        statesHash.put("Oregon", "Salem");
        statesHash.put("Pennsylvania", "Harrisburg");
        statesHash.put("Rhode Island", "Providence");
        statesHash.put("South Carolina", "Columbia");
        statesHash.put("South Dakota", "Pierre");
        statesHash.put("Tennessee", "Nashville");
        statesHash.put("Texas", "Austin");
        statesHash.put("Utah", "Salt Lake City");
        statesHash.put("Vermont", "Montpelier");
        statesHash.put("Virginia", "Richmond");
        statesHash.put("Washington", "Olympia");
        statesHash.put("West Virginia", "Charleston");
        statesHash.put("Wisconsin", "Madison");
        statesHash.put("Wyoming", "Cheyenne");
        
        //Get all states.
        Set<String> statesList = statesHash.keySet();
        
        //Print states.
        System.out.println("STATES:\n=======");
        for(String state : statesList) {
            System.out.println(state);
        }
        
        //Get all capitals.
        Collection<String> capitalsList = statesHash.values();
        
        //Print capitals.
        System.out.println("CAPITALS:\n=======");
        for(String capital : capitalsList) {
            System.out.println(capital);
        }
        
        //Print states and capitals.
        System.out.println("STATE/CAPITALS PAIRS:\n=======");
        for(String state : statesList) {
            System.out.println(state + " - " + statesHash.get(state));
        }
        
        
    }
}
