/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.enums;

import static com.adiaz.enums.MathOperator.DIVIDE;
import static com.adiaz.enums.MathOperator.MINUS;
import static com.adiaz.enums.MathOperator.MULTIPLY;
import static com.adiaz.enums.MathOperator.PLUS;

/**
 *
 * @author Anthony Diaz
 */
public class MathApp {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 5;
        
        int plus = calculate(PLUS, x, y);
        System.out.println(x + " + " + y + " = " + plus);
        
        int minus = calculate(MINUS, x, y);
        System.out.println(x + " - " + y + " = " + minus);
        
        int multiply = calculate(MULTIPLY, x, y);
        System.out.println(x + " * " + y + " = " + multiply);
        
        int divide = calculate(DIVIDE, x, y);
        System.out.println(x + " / " + y + " = " + divide);
        
    }
    
    public static int calculate(MathOperator operator, int operand1, int operand2) {
         switch(operator) {
                case PLUS:
                      return operand1 + operand2;
                case MINUS:
                      return operand1 - operand2;
                case MULTIPLY:
                      return operand1 * operand2;
                case DIVIDE:
                      return operand1 / operand2;
                default:
                      throw new UnsupportedOperationException();
         }
   }
}
