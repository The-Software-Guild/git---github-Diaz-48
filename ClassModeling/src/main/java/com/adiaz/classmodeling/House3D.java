/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.classmodeling;

/**
 *
 * @author Anthony Diaz
 */
public class House3D {
    private int rooms;
    private int bathrooms;
    private boolean hasPool;
    private double length;
    private double width;
    private double height;
    
    public House3D() {
        this.rooms = 0;
        this.bathrooms = 0;
        this.hasPool = false;
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }
    
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    
    public int getRooms() {
        return this.rooms;
    }
    
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
    
    public int getBathrooms() {
        return this.bathrooms;
    }
    
    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }
    
    public boolean getHasPool() {
        return this.hasPool;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void buildRoom() {
        
    }
    
    public void buildBathroom() {
        
    }
    
    public void buildHouse() {

    }
    
    public void buildPool() {
        
    }
    
}
