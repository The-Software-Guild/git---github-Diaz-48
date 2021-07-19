/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.shapesandperimeters;

/**
 *
 * @author Anthony Diaz
 */
public class Square extends Shape{
    
    private double size;
    
    public Square(String color, double size) {
        this.area = 0;
        this.perimeter = 0;
        this.color = color;
        this.size = size;
    }

    @Override
    public double getArea() {
        this.area = Math.pow(this.size, 2);
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = 4 * this.size;
        return this.perimeter;
    }
    
    
    
}
