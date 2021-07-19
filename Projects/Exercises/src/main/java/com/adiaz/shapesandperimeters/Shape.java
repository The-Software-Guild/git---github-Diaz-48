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
public abstract class Shape {
    protected double area;
    protected double perimeter;
    protected String color;
    
    public abstract double getArea();
    public abstract double getPerimeter();
}
