/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

import java.util.Scanner;

/**
 *
 * @author Anthony Diaz
 */
public class Adder {
    
    public static void main(String[] args) {
        
        int sum, op1, op2;
        op1 = op2 = 0;
        
        Scanner scan = new Scanner(System.in);
        
        String sOpt1, sOpt2;
        sOpt1 = sOpt2 = "";
        
        
        while(true) {
            System.out.println("Please enter the first number:");
            sOpt1 = scan.nextLine();
            
            if(!sOpt1.isEmpty() && sOpt1 != null) {
                try {
                    op1 = Integer.parseInt(sOpt1);
                }
                catch(NumberFormatException e) {
                    System.out.println("Value inputted is not a number.");
                    continue;
                }
                break;
            }
            else {
                System.out.println("No value given");
            }
        }
        
        boolean flag = false;
        
        do {
            System.out.println("Please enter the second number:");
            sOpt2 = scan.nextLine();
            
            if(!sOpt2.isEmpty() && sOpt2 != null) {
                try {
                    op2 = Integer.parseInt(sOpt2);
                }
                catch(NumberFormatException e) {
                    System.out.println("Value inputted is not a number.");
                    continue;
                }
                flag = true;
            }
            else {
                System.out.println("No value given");
            }
        }while(!flag);
        
        sum = op1 + op2;
        
        System.out.println("The added value is:" + sum);
        
//        System.out.println("Enter some data: ");
//        
//        String input = scan.nextLine();
        
        
        
    }
    
}
