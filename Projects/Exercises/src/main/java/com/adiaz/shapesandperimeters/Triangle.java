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
public class Triangle extends Shape{
    private double base;
    private double height;
    private double sideOne;
    private double sideTwo;
    
    public Triangle(String color, double base, double height, double sideOne, double sideTwo) {
        this.area = 0;
        this.perimeter = 0;
        this.base = base;
        this.height = height;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        this.area = (this.base * this.height) / 2;
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = this.base + this.sideOne + this.sideTwo;
        return this.perimeter;
    }
    
    
}
