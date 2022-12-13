/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author mkhat
 */
public class vehicle {
    private String make;
    private String color;
    private int year;      
    private String model;   
    public vehicle(String make, String color, int year, String model) 
    {
        this.make = make;
        this.color = color;
        this.year = year;  
        this.model = model; 
    }
    public void printDetails() 
    {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}