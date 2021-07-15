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
public class WindowMaster {
    public static void main(String[] args) {
        String height, width;
        float heightf, widthf, perimeter, area, cost;
        
        height = width = "";
        heightf = widthf = perimeter = area = cost = 0;
        
        Scanner scan = new Scanner(System.in);
        
        boolean flag = true;
        
        do {
            //Values from the user.
            System.out.println("Please enter the height:");
            height = scan.nextLine();
            
            if(height != null && height.isEmpty()) {
                System.out.println("The input is empty.");
            }
            else {
                try {
                    //Convert to float.
                    heightf = Float.parseFloat(height);
                }
                catch(NumberFormatException e) {
                    System.out.println("The input isn't a number.");
                    continue;
                }
                flag = false;
            }
            
        }while(flag);
        
        flag = true;
        do {
            //Values from the user.
            System.out.println("Please enter the width:");
            width = scan.nextLine();
            
            if(width != null && width.isEmpty()) {
                System.out.println("The input is empty.");
            }
            else {
                try {
                    //Convert to float.
                    widthf = Float.parseFloat(width);
                }
                catch(NumberFormatException e) {
                    System.out.println("The input isn't a number.");
                    continue;
                }
                flag = false;
            }
            
        }while(flag);
        
        //Finding area and perimeter
        perimeter = 2 * (heightf + widthf);
        area = heightf * widthf;
        
        //Finding the cost
        cost = (3.5f * area) + (2.5f * perimeter);
        
        System.out.println("The Height: " + height);
        System.out.println("The Width: " + width);
        System.out.println("The Area: " + area);
        System.out.println("The HeiPerimeter: " + perimeter);
        System.out.println("The Cost: " + cost);
    }
}
