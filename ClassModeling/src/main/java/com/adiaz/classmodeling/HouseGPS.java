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
public class HouseGPS {
    private String address;
    private int zipCode;
    private String city;
    private String state;
    private String country;
    
    public HouseGPS() {
        this.address = "";
        this.zipCode = 0;
        this.city = "";
        this.state = "";
        this.country = "";
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    public int getZipCode() {
        return this.zipCode;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public void navigate() {
    
    }

}
