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
public class Rectangle extends Shape{
    
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        this.area = 0;
        this.perimeter = 0;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        this.area = this.length * this.width;
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = 2 * (this.length + this.width);
        return this.perimeter;
    }
}
