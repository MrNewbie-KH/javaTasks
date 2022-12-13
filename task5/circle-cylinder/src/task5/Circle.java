/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5;

/**
 *
 * @author mkhat
 */
public class Circle {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(double r)
    {
        System.out.println("Here the value from constructor");
        radius=r;
    }
    public Circle()
    {
        
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
}
