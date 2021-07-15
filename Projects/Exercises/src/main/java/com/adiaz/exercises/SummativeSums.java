/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.exercises;

/**
 *
 * @author Anthony Diaz
 */
public class SummativeSums {
    public static void main(String[] args) {
        
        //Arrays to test.
        int[] arr1 = new int[] { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        
        int[] arr2 = new int[] { 999, -60, -77, 14, 160, 301 };
        
        int[] arr3 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                                    140, 150, 160, 170, 180, 190, 200, -99 };
        
        //Print results.
        System.out.println("#1 Array Sum: " + addArrayValues(arr1));
        System.out.println("#2 Array Sum: " + addArrayValues(arr2));
        System.out.println("#3 Array Sum: " + addArrayValues(arr3));
    }
    
    /**
     * 
     * @param arr: Array to process.
     * @return: Returns the sum of the values in the array.
     */
    public static int addArrayValues(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
}
