/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.collectionsandmaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Anthony Diaz
 */
public class StudentQuizGrades {
    public static void main(String[] args) {
        UserIOClass user = new UserIOClass();
        HashMap<String, ArrayList<Integer>> studentGrades = new HashMap<>();
        int userInt;
        
        do {
            userInt = user.readInt("\n\nPlease select an option: \n1. View all students in the system. \n2. Add a student \n"
                    + "3. Remove student \n4. View quiz scores for student. \n5. View average quiz score for student.");
            
            //View all students.
            if (userInt == 1) {
                Set<String> students = studentGrades.keySet();
                for(String student : students) {
                    System.out.println(student);
                }
            }
            //Add a student.
            else if(userInt == 2) {
                String student = user.readString("Please enter a student to add: ");
                studentGrades.put(student, new ArrayList<>());
                
                do {
                    int userInput = user.readInt("Please enter a score (-1 to exit):");
  
                    if(userInput != -1) {
                        ArrayList<Integer> scores = studentGrades.get(student);
                        scores.add(userInput);
                        studentGrades.put(student, scores);
                    }
                    else {
                        break;
                    }
                    
                }while(true);
            }
            //Remove a student.
            else if(userInt == 3) {
                String student = user.readString("Please enter a student to remove: ");
                studentGrades.remove(student);
            }
            //View quiz scores for student.
            else if(userInt == 4) {
                String student = user.readString("Please enter a student to view scores: ");
                ArrayList<Integer> scores = studentGrades.get(student);
                
                for(int score : scores) {
                    user.print(Integer.toString(score));
                }
            }
            //View average score for student {
            else if(userInt == 5) {
                String student = user.readString("Please enter a student to view average score: ");
                ArrayList<Integer> scores = studentGrades.get(student);
                int sum = 0;
                double average;
                
                for(int score : scores) {
                    sum += score;
                }
                
                average = sum / scores.size();
                
                user.print(Double.toString(average));
            }
            else {
                user.print("Could not read input.");
            }
            
        }while(true);
    }
}
